package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{
	
	@FXML
    private AnchorPane Apane;

    @FXML
    private Label header;

    @FXML
    private Label username;

    @FXML
    private Label password;

    @FXML
    private TextField txt1;

    @FXML
    private PasswordField txt2;

    @FXML
    private Button btn;

    @FXML
    private Label status;
    
    @FXML
    public void eventBtn(ActionEvent event) {
    	String user = txt1.getText();
    	String pass = txt2.getText();
    	
    	if(user.equals("eduardo") &&  pass.equals("123") ) {
    		status.setText("password and name are correct");
    		status.setStyle("-fx-text-fill:green");
    	}else {
    		status.setText("password and name are incorrect");
    		status.setStyle("-fx-text-fill:red");
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
