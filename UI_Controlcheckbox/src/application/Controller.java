package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

public class Controller implements Initializable{
	

    @FXML
    private CheckBox check;

    @FXML
    void eventButton(ActionEvent event) {
    	if(check.isSelected()) {
    		System.out.println("selected");
    	}else {
    		System.out.println("not selected");
    	}

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
