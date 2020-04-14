package scenebuilder;





import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable{
	
	@FXML
    private ChoiceBox<String> choice;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		choice.getItems().addAll("java","php","databases");
		
	}
	

    @FXML
    void eventButton(MouseEvent event) {
    	System.out.println( choice.getSelectionModel().getSelectedItem());
    }

	
    
    

}
