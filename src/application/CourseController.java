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
	public int COURSE_SIZE = 20;
	public static int tempNb;
	public static int maxPage = 1;
	public static int maxPageNb = 1;
	public static String cat;
	public static boolean tickOn = false;
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
    private ImageView tick;
    
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

	        
	        String cat = CourseController.cat;
	        int courseId = Util.getCourseId(cat);
	        Connection connection = DriverManager.getConnection(DbManager.url, DbManager.username, DbManager.password);
	        if(tempNb+1>maxPageNb) {
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
    	int sizeOfCourse = 19;
    	if(page.cat.equals("trigonometry")) sizeOfCourse = 15;
    	if(page.cat.equals("oop")) sizeOfCourse = 9;
    	controller.pageNb.setText("Page " + page.pageNb + " of " + sizeOfCourse);
    	if(page.pageNb < maxPageNb)
    		controller.tick.setImage(new javafx.scene.image.Image(getClass().getResource("images/tick.png").toString()));
    	else {
    		controller.tick.setImage(null);
		}
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
