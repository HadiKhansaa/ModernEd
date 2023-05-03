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

public class programmingController {

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
    	Course course = new Course("oop");
    	int pageNb = 1;

        Connection connection = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
        
    	String sql = "SELECT * FROM course_registeration WHERE courseId = 6 and userId = " + LoginController.ID;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next())
        {
        	pageNb = rs.getInt(3);
        	CourseController.maxPageNb = pageNb;
        }
        else // user not yet registered in course
        {
        	
        	String sql2 = "INSERT INTO course_registeration (userId, courseId, pageNb) VALUES (?, ?, ?)";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, LoginController.ID);
            stmt2.setInt(2, 6);
            stmt2.setInt(3, 1);
            Boolean rs2 = stmt2.execute();
            System.out.println("Rows inserted: " + rs2);
            CourseController.maxPageNb = 1;
        }
    	course.updatePage(pageNb, event);
    }

    @FXML
    void openTrigo(ActionEvent event) throws IOException, SQLException {
    	Course course = new Course("introToProgramming");
    	int pageNb = 1;

        Connection connection = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
        
    	String sql = "SELECT * FROM course_registeration WHERE courseId = 5 and userId = " + LoginController.ID;
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next())
        {
        	pageNb = rs.getInt(3);
        	CourseController.maxPageNb = pageNb;
        }
        else // user not yet registered in course
        {
        	
        	String sql2 = "INSERT INTO course_registeration (userId, courseId, pageNb) VALUES (?, ?, ?)";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, LoginController.ID);
            stmt2.setInt(2, 5);
            stmt2.setInt(3, 1);
            Boolean rs2 = stmt2.execute();
            System.out.println("Rows inserted: " + rs2);
            CourseController.maxPageNb = 1;
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
