package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.DepthTest;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

import java.io.IOException;

public class ResultController{

    int grade = QuizController.correct;
    int wrong = QuizController.wrong;
    @FXML
    Label result,gradeLabel;

    @FXML
    ProgressIndicator correctProg, wrongProg;

    @FXML
    Button retry,done;

    @FXML
    public void initialize() {

        if (grade >= 0 && grade <= 4) {
            result.setText("Mistakes are proof that you are trying. Keep trying and you will succeed.");
        } else if (grade >= 5 && grade <= 6) {
            retry.setDisable(true);
            result.setText("Success is not final, failure is not fatal: it is the courage to continue that counts.");
        } else if (grade > 6 && grade < 8) {
            retry.setDisable(true);
            result.setText("Success is a journey, not a destination. Keep up the good work.");
        } else {
            retry.setDisable(true);
            result.setText("Believe in yourself and all that you are. Keep up the amazing work!");
        }

        correctProg.setProgress((float)grade/10);
        wrongProg.setProgress((float)wrong/10);
        gradeLabel.setText("You Got "+ grade + "/10 Correct Answers!");
    }

    @FXML
    public void onClickRetry(ActionEvent event) throws IOException {

            QuizController.correct = 0;
            QuizController.wrong = 0;
            QuizController.counter=0;
        Stage thisStage =(Stage) ((Button) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        thisStage.setScene(scene);
        thisStage.show();
    }



    public void onClickDone(ActionEvent event) throws IOException {

            QuizController.correct = 0;
            QuizController.wrong = 0;
            QuizController.counter=0;
        Stage thisStage =(Stage) ((Button) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        thisStage.setScene(scene);
        thisStage.show();


    }


}
