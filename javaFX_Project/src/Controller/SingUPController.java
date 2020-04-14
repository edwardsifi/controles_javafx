package Controller;



import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import DBConnection.connection;

import AlertMessage.message;

public class SingUPController implements Initializable{
	
	@FXML
    private JFXTextField fullname;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXPasswordField email;

    @FXML
    private JFXCheckBox check;

    @FXML
    private JFXButton singup;

    @FXML
    private JFXButton login;

    private PreparedStatement ps;
	
    message msg = new message();	
	connection conOBJ = new connection();
	Connection con;		

	 @FXML
	 public void gologin(ActionEvent event) throws IOException {
		 login.getScene().getWindow().hide();
		 
		 Stage login = new Stage();
		 Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/login.fxml"));
		 Scene scene = new Scene(root);
		 login.setScene(scene);
		 login.show();
	 }

	 @FXML
	 void signup(ActionEvent event) throws ClassNotFoundException, SQLException {
		 if(check.isSelected()) {
		 con = conOBJ.getConnection();
		 
		 System.out.println();
		 System.out.println("connected todatabased");
		 
		 String insert  = "insert into student (fullName,password,email)"
				 + "values (?,?,?)";
		 ps = con.prepareStatement(insert);
		 
		 ps.setString(1, fullname.getText());
		 ps.setString(2, password.getText());
		 ps.setString(3, email.getText());
		 
		 ps.executeUpdate();
		 System.out.println("data inserted");
		 
		 msg.setMessage("data is inserted");
	 }else {
		 msg.setMessage("agree terms and conditions");
	 }
  }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		fullname.setStyle("-fx-text-inner-color:#4b5461");
		email.setStyle("-fx-text-inner-color:#4b5461");
		password.setStyle("-fx-text-inner-color:#4b5461");
		
	}

}
