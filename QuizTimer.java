package application;

import javafx.application.Platform;
import javafx.scene.control.Label;
import java.util.Timer;
import java.util.TimerTask;

public class QuizTimer {
    public Timer timer;
    private int timeRemaining;
    private Label label;
    private Runnable timeUpAction;

    public QuizTimer(int timeInSeconds, Label label, Runnable timeUpAction) {
        this.timeRemaining = timeInSeconds;
        this.label = label;
        this.timeUpAction = timeUpAction;
    }
    
    public void resetTimer(int sec) {
    	timeRemaining = sec;
    }

    public void start() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                timeRemaining--;
                if (timeRemaining < 0) {
                    timer.cancel();
                    Platform.runLater(timeUpAction);
                } else {
                    Platform.runLater(() -> label.setText("" + timeRemaining));
                }
            }
        }, 0, 1000);
    }
}
