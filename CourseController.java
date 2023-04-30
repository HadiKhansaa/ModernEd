package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

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

}
