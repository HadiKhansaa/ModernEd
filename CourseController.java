package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CourseController {

    @FXML
    private ImageView image;

    @FXML
    private Text textArea;

    @FXML
    private Text title;
    
    @FXML
    private Button back;
    
    @FXML
    void openHome(ActionEvent event) throws IOException {
    	Util.openPage(this, event, "Home.fxml");
    }
    
    public CourseController(Page page, ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Course.fxml"));
    	Parent root = loader.load();
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        
        //edit content
        textArea.setText(page.desc);
        image.setImage(new javafx.scene.image.Image(page.image));
        stage.show();
    }

}
