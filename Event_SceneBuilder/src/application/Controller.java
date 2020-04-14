package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Controller implements Initializable{

	    @FXML
	    private Button btn;

	    

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			btn.setStyle("-fx-text-fill:#ccc");
			
		}
		
		@FXML
	    void eventbutton(ActionEvent event) {

	    	System.out.println("hello world");
	    	btn.setStyle("-fx-text-fill:#333");
	    }
}
