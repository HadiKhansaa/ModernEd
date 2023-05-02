package application;

//import com.example.educationalapp.com.example.educationalapp.Quiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;


public class QuizController {
    @FXML
    public Label question;

    @FXML
    protected Button opt1,opt2,opt3,opt4,next;

    @FXML
    public Label timer;

    protected static int correct = 0, wrong = 0,counter = 0;

    Integer[] random = {1,2,3,4};


    public void next(ActionEvent actionEvent){
        loadQuestions();

    }

    private void loadQuestions(){
        counter++;
        if(counter == 11){
            //move to result stage
            try {
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
            opt1.setStyle("-fx-background-color: white;");
            opt2.setStyle("-fx-background-color: white;");
            opt3.setStyle("-fx-background-color: white;");
            opt4.setStyle("-fx-background-color: white;");

//            timer.setText("hi");
//            startTime();
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
    }
    @FXML
    public void optClicked(ActionEvent actionEvent) {
        Button ChosenBtn = (Button)(actionEvent.getSource());
        String ChosenAnswer = ChosenBtn.getText();
        Button correctButton = getCorrectButton();
        String correctAnswer = correctButton.getText();

        if (ChosenAnswer.equals( correctAnswer)) {
            correct++;
//            timer.setText(correct + "/" + 10);
        }
        else
            wrong++;

//        opt1.setDisable(true);
//        opt2.setDisable(true);
//        opt3.setDisable(true);
//        opt4.setDisable(true);
        opt1.setStyle("-fx-background-color: red;");
        opt2.setStyle("-fx-background-color: red;");
        opt3.setStyle("-fx-background-color: red;");
        opt4.setStyle("-fx-background-color: red;");
        correctButton.setStyle("-fx-background-color: green;");
        
        next.setDisable(false);
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

//    private final int timeRemaining = 10; // set the time for each question here (in seconds)
//
//    private void startTime() {
////        final Label timeLabel = new Label(String.valueOf(timeRemaining));
//
//        timer.setText("00:" + String.format("%02d", timeRemaining));
//        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), event -> {
//            timer.setText(String.valueOf(Integer.parseInt(timer.getText()) - 1));
//            if (Integer.parseInt(timer.getText()) <= 0) {
//                if (timeRemaining >= 0) {
//                    timer.setText("00:" + String.format("%02d", timeRemaining));
//                } else {
////                    timeline.stop();
//                    timer.setText("00:" + String.format("%02d", timeRemaining));
////                    next.fire();
//                    // code to handle when time runs out
//                }
//            }
//        });
//        timeline.getKeyFrames().add(keyFrame);
//        timeline.playFromStart();
//    }






    @FXML
    public void initialize() {
        Quiz.setQuestions(CourseController.cat);
        loadQuestions();

    }



}


