package scenebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	@FXML
    private TextField txt;

    @FXML
    private PasswordField pass;

   
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	 @FXML
	 void eventButton(ActionEvent event) {
		 System.out.println(txt.getText());
		 System.out.println(pass.getText());
	 }
	
}
