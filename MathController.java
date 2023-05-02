package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    	int pageNb = 1;
//    	Connection connection = DbManager.DbInit();
    	String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        
    	String sql = "SELECT * FROM course_registeration WHERE courseId = 1 and userId = " + LoginController.ID;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next())
        {
        	pageNb = rs.getInt(3);
        }
        else // user not yet registered in course
        {
        	
        	String sql2 = "INSERT INTO course_registeration (userId, courseId, pageNb) VALUES (?, ?, ?)";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, LoginController.ID);
            stmt2.setInt(2, 1);
            stmt2.setInt(3, 1);
            Boolean rs2 = stmt2.execute();
            System.out.println("Rows inserted: " + rs2);
        }
    	course.updatePage(pageNb, event);
    }

    @FXML
    void openTrigo(ActionEvent event) throws IOException, SQLException {
    	Course course = new Course("trigonometry");
    	
    	int pageNb = 1;
//    	Connection connection = DbManager.DbInit();
    	String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);
        
    	String sql = "SELECT * FROM course_registeration WHERE courseId = 2 and userId = " + LoginController.ID;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next())
        {
        	pageNb = rs.getInt(3);
        }
        else // user not yet registered in course
        {
        	
        	String sql2 = "INSERT INTO course_registeration (userId, courseId, pageNb) VALUES (?, ?, ?)";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, LoginController.ID);
            stmt2.setInt(2, 2);
            stmt2.setInt(3, 1);
            Boolean rs2 = stmt2.execute();
            System.out.println("Rows inserted: " + rs2);
        }
    	course.updatePage(pageNb, event);
    	
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
