package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import DBConnection.connection;



public class HomePageController implements Initializable{
	
	@FXML
    private JFXButton showData;

    @FXML
    private TableView<Student> table;
    
    @FXML
    private TableColumn<Student, String> fullname;

    @FXML
    private TableColumn<Student, String> password;

    @FXML
    private TableColumn<Student, String> email;
    
    Connection con;
    
    PreparedStatement pst;
    
    connection conOBJ = new connection();

    @FXML
    void showData(ActionEvent event) throws ClassNotFoundException, SQLException {
    	con = conOBJ.getConnection();
    	
    	ObservableList<Student> data = FXCollections.observableArrayList();
    	
    	table.setItems(data);
    	
    	String str = "select *from student";
    	
    	pst = con.prepareStatement(str);
    	
    	ResultSet rs = pst.executeQuery();
    	
    	while(rs.next()) {
    		Student s = new Student(rs.getString("fullName"),rs.getString("password"),rs.getString("email"));
    		data.add(s);
    	}
    	
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		fullname.setCellValueFactory(new PropertyValueFactory<Student, String>("fullName"));
		password.setCellValueFactory(new PropertyValueFactory<Student, String>("password"));
		email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
	}

}
