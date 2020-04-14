package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import DBConnection.connection;

import AlertMessage.message;

public class LoginController {

	@FXML
    private AnchorPane anPane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton register;

    @FXML
    private JFXButton login;
    
    private PreparedStatement pst;
    
    Connection con;
    
    connection conClass = new connection();
    message msg = new message();

    @FXML
    void createLogin(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	
    	con = conClass.getConnection();
    	System.out.println(con);
    	System.out.println("Connected database");
    	
    	String str = "SELECT *FROM STUDENT where email=? and password=?";
    	pst = con.prepareStatement(str);
    	
    	pst.setString(1, username.getText());
    	pst.setString(2, password.getText());
    	
    	ResultSet rs = pst.executeQuery();
    	int count = 0;
    	
    	while(rs.next()) {
    		System.out.println("hla");
    		count= count+1;
    	}
    	
    	if(count==1) {
    		
    		msg.setMessage("login is successfull");
    		login.getScene().getWindow().hide();
    		Stage home = new Stage();
    		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/HomePage.fxml"));
    		home.setScene(new Scene(root));
    		home.show();
    	}else {
    		msg.setMessage("login is failed");
    	}
    	
    }

    @FXML
    void createregistrer(ActionEvent event) throws IOException {
    	register.getScene().getWindow().hide();
    	
    	Stage signup = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/SingUP.fxml"));
    	Scene scene = new Scene(root);
    	signup.setScene(scene);
    	signup.show();
    	
    }

}
