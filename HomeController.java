package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class HomeController {

    @FXML
    private Button contact;

    @FXML
    private Button english;

    @FXML
    private ImageView englishIcon;

    @FXML
    private Button home;

    @FXML
    private Button math;

    @FXML
    private ImageView mathIcon;

    @FXML
    private Button profile;

    @FXML
    private Button programming;

    @FXML
    private ImageView programmingIcon;

    @FXML
    private Button register;

    @FXML
    void contactClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Contact.fxml");
    }

    @FXML
    void profileClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Profile.fxml");
    }

    @FXML
    void registerClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Signup.fxml");
    }
    
    @FXML
    void openMath(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Math.fxml");
    }
    
    @FXML
    void openProg(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "programming.fxml");
    }
    
    @FXML
    void openEnglish(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "English.fxml");
    }

}
