package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ContactController {

    @FXML
    private Button contact;

    @FXML
    private Button home;

    @FXML
    private Button profile;

    @FXML
    private Button register;

    @FXML
    void homeClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Home.fxml");
    }

    @FXML
    void profileClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Profile.fxml");
    }

    @FXML
    void registerClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Signup.fxml");
    }

}
