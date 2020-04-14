package scenebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	
	@FXML
    private JFXTextField txt;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton btn;

    @FXML
    void eventButton(ActionEvent event) {
    	System.out.println(txt.getText());
    	System.out.println(pass.getText());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		txt.setStyle("-fx-text-inner-color:blue;");
		
	}

}
