package application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class MathController {

    @FXML
    private Button calculus;

    @FXML
    private Button contact;

    @FXML
    private ImageView englishIcon;

    @FXML
    private Button home;

    @FXML
    private ImageView mathIcon;

    @FXML
    private Button profile;

    @FXML
    private Button register;

    @FXML
    private Button trigo;

    @FXML
    void contactClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Contact.fxml");
    }

    @FXML
    void openCalculus(ActionEvent event) throws IOException, SQLException {
    	Course course = new Course("calculus");
    	int pageNb = 0;
    	course.updatePage(pageNb);
    }

    @FXML
    void openTrigo(ActionEvent event) throws IOException, SQLException {
    	Course course = new Course("trigonometry");
    	int pageNb = 0;
    	course.updatePage(pageNb);
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
    void homeClick(ActionEvent event) throws IOException{
    	Util.openPage(this, event, "Home.fxml");
    }

}
