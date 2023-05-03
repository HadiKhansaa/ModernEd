package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Util {
	public static String currentCatString = "";
			
	public static void openPage(Object o, ActionEvent event, String pageName) throws IOException {
		FXMLLoader loader = new FXMLLoader(o.getClass().getResource(pageName));
    	Parent root = loader.load();
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
	}
	
	public static int getCourseId(String cat) {
		int courseId = 0;
		if(cat == "calculus") courseId = 1;
		if(cat == "trigonometry") courseId = 2;
		if(cat == "grammar") courseId = 3;
		if(cat == "writing") courseId = 4;
		if(cat == "introToProgramming") courseId = 5;
		if(cat == "oop") courseId = 6;
		
		return courseId;
	}
	
}
