package application;


import java.io.IOException;
import java.net.URL;
import java.rmi.server.LoaderHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.management.loading.PrivateClassLoader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ProfileController implements Initializable{
	
	public int pageTrigo = 0, pageCalculus = 0, pageGrammar = 0, pageWriting = 0, pageIntroProg = 0, pageOop = 0;
	
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
	private Button resetTrigo;
	@FXML
	private Button resetCalculus;
	@FXML
	private Button resetIntro;
	@FXML
	private Button resetOop;
	@FXML
	private Button resetGrammar;
	@FXML
	private Button resetWriting;

	@FXML
	ProgressBar trigoBar,introProgBar,grammarBar,writingBar,oopBar,calculusBar;

	@FXML
	private Button deleteAccount;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		name.setText(LoginController.NAME);
		email.setText(LoginController.EMAIL);
		phone.setText(LoginController.PHONE);
		age.setText(""+LoginController.AGE);
		
        Connection conn = null;
		try {
			conn = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql2 = "SELECT * FROM course_registeration WHERE userId = " + LoginController.ID;
        try {
			PreparedStatement stmt2 = conn.prepareStatement(sql2);
			ResultSet rs =  stmt2.executeQuery(sql2);
			
			while(rs.next()) {
					switch (rs.getInt(2)) {
					case 1:
						pageCalculus = rs.getInt(3);
						System.out.println(pageCalculus);
						break;
					case 2:
						pageTrigo = rs.getInt(3);
						break;
					case 3:
						pageGrammar = rs.getInt(3);
						break;
					case 4:
						pageWriting = rs.getInt(3);
						break;
					case 5:
						pageIntroProg = rs.getInt(3);
						break;
					case 6:
						pageOop = rs.getInt(3);
						break;

					default:
						break;
					}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //if course is done
        float toAddC = 0, toAddT=0, toAddG = 0, toAddW = 0, toAddO=0, toAddI=0;
        if(pageCalculus > 20) toAddC = (float) 0.3;
        if(pageTrigo > 20) toAddT = (float) 0.3;
        if(pageGrammar > 20) toAddG = (float) 0.3;
        if(pageWriting > 20) toAddW = (float) 0.3;
        if(pageIntroProg > 20) toAddI = (float) 0.3;
        if(pageOop > 20) toAddO = (float) 0.3;

		trigoBar.setProgress(0.7*(pageTrigo/15.0) + toAddT);
		introProgBar.setProgress(0.7*(pageIntroProg/20.0) + toAddI);
		grammarBar.setProgress(0.7*(pageGrammar/20.0) + toAddG);
		writingBar.setProgress(0.7*(pageWriting/20.0) + toAddW);
		oopBar.setProgress(0.7*(pageOop/9.0) + toAddO);
		calculusBar.setProgress(0.7*(pageCalculus/20.0) + toAddC);
		
		calculusBar.setStyle("-fx-accent: red;");
		introProgBar.setStyle("-fx-accent: blue;");
		grammarBar.setStyle("-fx-accent: purple;");
		writingBar.setStyle("-fx-accent: black;");
		trigoBar.setStyle("-fx-accent: green;");
		oopBar.setStyle("-fx-accent: orange;");
	}
	
	public void fillBar(String cat) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
    	loader.load();
    	ProfileController con = loader.getController();
    	
		if(cat == "calculus") con.calculusBar.setProgress(1);
		if(cat == "trigonometry") con.trigoBar.setProgress(1);
		if(cat == "writing") con.writingBar.setProgress(1);
		if(cat == "grammar") con.grammarBar.setProgress(1);
		if(cat == "introToProgramming") con.introProgBar.setProgress(1);
		if(cat == "oop") con.oopBar.setProgress(1);	
	}

	
	@FXML
    void logout(ActionEvent event) throws IOException {
		Util.openPage(this, event, "Login.fxml");
    }
	
	@FXML
    void deleteAccount(ActionEvent event) throws SQLException, IOException {
		DbManager.deleteAccount(LoginController.ID, event, this);
		logout(event);
    }
	
	@FXML
	void reset(ActionEvent event) throws SQLException, IOException {
		Button button = (Button) event.getTarget();
		String id = button.getId();
		int courseId = 0;
		if(id.equals("resetTrigo")) {
			courseId = 2;
		}else if(id.equals("resetCalculus")) {
			courseId = 1;
		}else if(id.equals("resetIntro")) {
			courseId = 5;
		}else if(id.equals("resetOop")) {
			courseId = 6;
		}else if(id.equals("resetGrammar")) {
			courseId = 3;
		}else if(id.equals("resetWriting")) {
			courseId = 4;
		}
		
		Connection conn = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
		String sql = "UPDATE course_registeration SET pageNb = 1 WHERE userId = " + LoginController.ID 
				+ " and courseId = " + courseId;
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();
		Util.openPage(this, event, "Profile.fxml");
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