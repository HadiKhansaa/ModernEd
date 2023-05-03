package application;

//import com.example.educationalapp.com.example.educationalapp.Quiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;


public class QuizController {
	
	ProfileController profileController = new ProfileController();
    @FXML
    public Label question;

    @FXML
    protected Button opt1,opt2,opt3,opt4,next;

    @FXML
    public Label timer;

    protected static int correct = 0, wrong = 0,counter = 0;

    Integer[] random = {1,2,3,4};


    public void next(ActionEvent actionEvent) throws SQLException{
        loadQuestions();

    }

    private void loadQuestions() throws SQLException{
        counter++;
        if(counter == 11){
            //move to result stage
            try {
            	if(correct>7) {
            		//modify database to course done
                    Connection conn = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
                    
                    int courseId = 0;
                    String cat = CourseController.cat;
        	        if(cat == "calculus") courseId = 1;
        			if(cat == "trigonometry") courseId = 2;
        			if(cat == "grammar") courseId = 3;
        			if(cat == "writing") courseId = 4;
        			if(cat == "introToProgramming") courseId = 5;
        			if(cat == "oop") courseId = 6;
        			
                    String sql = "UPDATE course_registeration SET pageNb = 21 WHERE userId = " + LoginController.ID + " and courseId = " + courseId;
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.execute();
            		notifyProfile();
            	}
                Stage thisStage =(Stage) opt1.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                thisStage.setScene(scene);
                thisStage.show();

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }
        else{
            
            opt1.setStyle("-fx-background-color: white; -fx-wrap-text: true;");
            opt2.setStyle("-fx-background-color: white; -fx-wrap-text: true;");
            opt3.setStyle("-fx-background-color: white; -fx-wrap-text: true;");
            opt4.setStyle("-fx-background-color: white; -fx-wrap-text: true;");

            question.setText(counter + ". "+ Quiz.questions[counter-1].get("question"));
            shuffleArray(random);
            opt1.setText(Quiz.questions[counter-1].get("answer"+random[0]));
            opt2.setText(Quiz.questions[counter-1].get("answer"+random[1]));
            opt3.setText(Quiz.questions[counter-1].get("answer"+random[2]));
            opt4.setText(Quiz.questions[counter-1].get("answer"+random[3]));
            opt1.setDisable(false);
            opt2.setDisable(false);
            opt3.setDisable(false);
            opt4.setDisable(false);
            next.setDisable(true);

        }
    }

    private void shuffleArray(Integer[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        if(quizTimer!=null)
        {
        	quizTimer.resetTimer(16);
        	quizTimer.start();
        }
    }
    @FXML
    public void optClicked(ActionEvent actionEvent) {
        Button ChosenBtn = (Button)(actionEvent.getSource());
        String ChosenAnswer = ChosenBtn.getText();
        Button correctButton = getCorrectButton();
        String correctAnswer = correctButton.getText();

        if (ChosenAnswer.equals( correctAnswer)) {
            correct++;
        }
        else
            wrong++;

//        opt1.setDisable(true);
//        opt2.setDisable(true);
//        opt3.setDisable(true);
//        opt4.setDisable(true);
        opt1.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt2.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt3.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt4.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        correctButton.setStyle("-fx-background-color: green; -fx-wrap-text: true;");
        
        next.setDisable(false);
        quizTimer.timer.cancel();
        quizTimer.resetTimer(16);
    }


    private Button getCorrectButton() {
        if (Quiz.questions[counter-1].get("correct").equals(opt1.getText())) {
            return opt1;
        } else if (Quiz.questions[counter-1].get("correct").equals(opt2.getText())) {
            return opt2;
        } else if (Quiz.questions[counter-1].get("correct").equals(opt3.getText())) {
            return opt3;
        } else {
            return opt4;
        }
    }
    
    private void notifyProfile() throws IOException {
    	profileController.fillBar(CourseController.cat);
    }

    private QuizTimer quizTimer;
    @FXML
    public void initialize() throws SQLException {    	
        Quiz.setQuestions(CourseController.cat);
        loadQuestions();
        QuizTimer qt = new QuizTimer(16, timer, this::timeUpAction);
        qt.start();
        quizTimer = qt;
    }
    
    public void timeUpAction() {
    	opt1.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt2.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt3.setStyle("-fx-background-color: red; -fx-wrap-text: true;");
        opt4.setStyle("-fx-background-color: red; -fx-wrap-text: true;");        
        next.setDisable(false);
        
        opt1.setDisable(true);
        opt2.setDisable(true);
        opt3.setDisable(true);
        opt4.setDisable(true);
        wrong++;
        
        quizTimer.timer.cancel();
    }
}