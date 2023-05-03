package application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Alert.AlertType;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class SignupController {

	@FXML
	private TextField email;
	
	@FXML
	private TextField name;
	
	@FXML
	public PasswordField password;
	
	@FXML
	public PasswordField repeatPassword;
	
	@FXML
	private TextField phone;
	
	@FXML
	private TextField age;
	
	@FXML
	private Button signup;
	
    @FXML
    void openLoginFXML(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
    	Parent root = loader.load();
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    	    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  	public static boolean validate(String emailStr) {
  	        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
   	        return matcher.matches();
   	}

    @FXML
    void signup(ActionEvent event) {
    	try
    	{
	    	if(password.getText().equals(repeatPassword.getText()))
	    	{
	    		if(password.getText().length()<7)
	    		{
	    			Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    		alert.setContentText("Password too short");
		    		alert.show();
	    		}
	    		else
	    		{
	    			if(validate(email.getText()))
	    			{
	    				DbManager.addUser(email.getText(), name.getText(), password.getText(), phone.getText(), Integer.parseInt(age.getText()));
	    				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	    				alert.setContentText("User registered successfully!");
	    				alert.show();
	    			}
    				else {
    				Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    		alert.setContentText("Email not valid");
		    		alert.show();
	    			}
	    		}
	    	}
	    	else {
	    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    		alert.setContentText("Password and repeat-password don't match");
	    		alert.show();
	    	}
	    }catch(Exception e){
	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setContentText("Invalid cardinals");
			System.out.println(e.getLocalizedMessage());
			alert.show();
	    }
	    	
    }
}
