package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.cj.callback.UsernameCallback;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	public static String EMAIL, NAME, PHONE;
	public static boolean LOGGED = false;
	public static int AGE, ID;
	
	
    @FXML
    private Hyperlink register;
    
    @FXML
    private TextField email;
    
    @FXML 
    private PasswordField password;
    
    @FXML
    private Button loginBtn;

    @FXML
    void openSigupFXML(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Signup.fxml");
    }
    
    @FXML
    void login(ActionEvent event) throws IOException {
    	DbManager.userLogin(email.getText(), password.getText());
    	
    	if(LoginController.LOGGED) {
        	Util.openPage(this, event, "Home.fxml");
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	void hover(ActionEvent event) {
		loginBtn.getStyleClass().add("hover-loginBtn");
	}

}
