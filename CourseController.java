package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CourseController implements Initializable {
	public final int COURSE_SIZE = 20;
	public static int tempNb;
	public static int maxPage = 1;
	public static String cat;
    @FXML
    private ImageView image;

    @FXML
    private Text textArea;

    @FXML
    private Text title;
    
    @FXML
    private Button back;
    
    @FXML
    private Text pageNb;
    
    @FXML
    public void goBack(ActionEvent event) throws SQLException, IOException {
    	Course course = new Course(CourseController.cat);
    	course.updatePage(CourseController.tempNb-1, event);
    }
    
    @FXML
    public void openHome(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Home.fxml");
    }
    
    @FXML
    public void loadNextPage(ActionEvent event) throws SQLException, IOException {
    	if(tempNb<COURSE_SIZE) {
	    	String url = "jdbc:mysql://localhost:3306/moderned";
	        String username = "root";
	        String password = "";
	        int courseId = 0;
	        String cat = CourseController.cat;
	        if(cat == "calculus") courseId = 1;
			if(cat == "trigonometry") courseId = 2;
			if(cat == "grammar") courseId = 3;
			if(cat == "writing") courseId = 4;
			if(cat == "introToProgramming") courseId = 5;
			if(cat == "oop") courseId = 6;
	        Connection connection = DriverManager.getConnection(url, username, password);
	        if(tempNb+1>maxPage) {
	        	maxPage = tempNb+1;
	        	String sql = "UPDATE course_registeration SET pageNb = pageNb+1 WHERE userId = " + LoginController.ID + " and courseId = " + courseId;
	        	PreparedStatement stmt = connection.prepareStatement(sql);
		        stmt.executeUpdate();
	        }
	        Course course = new Course(cat);
	        course.updatePage(CourseController.tempNb+1, event);
    	}
    }
    
    public CourseController() {
		// TODO Auto-generated constructor stub
	}
    public CourseController(Page page, ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Course.fxml"));
    	Parent root = loader.load();
    	
    	CourseController controller = loader.getController();
    	controller.textArea.setText(page.desc);
//    	controller.image.setImage(new javafx.scene.image.Image(page.image));
    	controller.title.setText(page.title);
    	controller.pageNb.setText("Page " + page.pageNb + " of 20");
    	tempNb = page.pageNb;
    	CourseController.cat = page.cat;
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
       
        stage.show();
    }
   

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
//		textArea.setText("Destitute");
		
	}
    

}
