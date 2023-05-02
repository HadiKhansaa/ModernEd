package application;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileController implements Initializable{

	
	@FXML
	private Label name;
	@FXML
	private Label email;
	@FXML
	private Label phone;
	@FXML
	private Label age;
	@FXML
	private Button logout;
	@FXML
	private Button deleteAccount;
	
	@FXML
    void logout(ActionEvent event) throws IOException {
		Util.openPage(this, event,"Login.fxml");
    }
	
	@FXML
    void deleteAccount(ActionEvent event) throws SQLException, IOException {
		DbManager.deleteAccount(LoginController.ID, event, this);
		logout(event);
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		name.setText(LoginController.NAME);
		email.setText(LoginController.EMAIL);
		phone.setText(LoginController.PHONE);
		age.setText(""+LoginController.AGE);
	}
	
	@FXML
    void homeClick(ActionEvent event) throws IOException {
		Util.openPage(this, event, "Home.fxml");
    }
	
	@FXML
    void contactClick(ActionEvent event) throws IOException {
		Util.openPage(this, event, "Contact.fxml");
    }
	
	@FXML
    void registerClick(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Signup.fxml");
    }

}
