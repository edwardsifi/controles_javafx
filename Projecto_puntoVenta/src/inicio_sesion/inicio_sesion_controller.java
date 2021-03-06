package inicio_sesion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import dbconnection.connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class inicio_sesion_controller {
	@FXML
    private JFXButton btnsesion;

    @FXML
    private JFXTextField txt_usuario;

    @FXML
    private JFXPasswordField txt_password;
    
    private PreparedStatement pst;
    
    Connection con;
    
    connection conect = new connection();

    @FXML
    void inicio_sesion(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	con = conect.getconnection();
    	System.out.println(con);
    	System.out.println("conectados a la base de datos");
    	
    	String str = "select * from usuario where nombre_usuario = ? and contrasena_usuario = ?";
    	pst = con.prepareStatement(str);
    	pst.setString(1, txt_usuario.getText());
    	pst.setString(2, txt_password.getText());
    	
    	ResultSet rs = pst.executeQuery();
    	
    	int count = 0;
    	
    	while(rs.next()) {
    		System.out.println("encontrado");
    		count = count + 1;
    	}
    	
    	if(count == 1 ) {
    		System.out.println("abrir nueva scene");
    		btnsesion.getScene().getWindow().hide();
    		Stage home = new Stage();
    		Parent root = FXMLLoader.load(getClass().getResource("/inicio/Scene.fxml"));
    		home.setScene(new Scene(root));
    		home.show();
    	}else {
    		System.out.println("incorrecto inicio de sesion");
    	}
    	
    	
    	
    }
}
