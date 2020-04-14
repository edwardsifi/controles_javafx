package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller implements Initializable{
	
	@FXML
    private RadioButton male;

    @FXML
    private ToggleGroup group;

    @FXML
    private RadioButton female;

    @FXML
    private RadioButton other;

    @FXML
    void eventButton(ActionEvent event) {
    	if(male.isSelected()) {
    		System.out.println("male");
    	}else if(female.isSelected()) {
    		System.out.println("female");
    	}else {
    		System.out.println("other");
    	}
    }
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
