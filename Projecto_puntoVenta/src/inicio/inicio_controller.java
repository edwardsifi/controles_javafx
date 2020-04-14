package inicio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class inicio_controller implements Initializable{
	
	@FXML
    private JFXButton btninventario;

    @FXML
    private JFXButton btnpcobrar;

    @FXML
    private JFXButton btnproveedores;

    @FXML
    private JFXButton btnventas;

    @FXML
    void irinvenario(ActionEvent event) throws IOException {
    	btninventario.getScene().getWindow().hide();
    	Stage home = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/ingresar_inventario/Scene.fxml"));
    	home.setScene(new Scene(root));
    	home.show();
    }

    @FXML
    void irpcobrar(ActionEvent event) {

    }

    @FXML
    void irproveedores(ActionEvent event) {

    }

    @FXML
    void irventas(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
