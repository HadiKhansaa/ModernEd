package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application{
   
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Login");
			primaryStage.show();			
			
//			String url = "jdbc:mysql://localhost:3306/moderned";
//	        String username = "root";
//	        String pass = "";
//	        
//            Properties props = new Properties();
//            props.put("user", username);
//            props.put("password", pass);
//            props.put("allowLoadLocalInfile", "true"); // enable LOAD DATA LOCAL INFILE
//            props.put("MYSQLI_OPT_LOCAL_INFILE", "true");
//            Connection conn = DriverManager.getConnection(url, props);
//
//	        String sql = 
//	        		"USE moderned;/n" +
//	        "SET @pageId = 0;/n"+
//	        "SET @courseId = 1;/n"+
//	        "LOAD DATA LOCAL INFILE 'C:\\Users\\hadik\\Downloads\\Telegram Desktop\\calculus.txt'/n"+
//	        "INTO TABLE moderned.course_pages/n"+
//	        "FIELDS TERMINATED BY '\n'"+
//	        "LINES TERMINATED BY '\n\n'"+
//	        "(@title, @desc, @image)/n"+
//	        "SET pageId = (@pageId := @pageId + 1),/n"+
//	        "    courseId = @courseId;/n";
//	        PreparedStatement stmt = conn.prepareStatement(sql);
//	        stmt.execute();
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
