package scenebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller implements Initializable{
	
	@FXML
    private ListView<String> list;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list.getItems().addAll("java","jafax","php","django");
		list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		list.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String>ob ,String old, String newV)->{
			System.out.println(old);
			System.out.println(newV);
		});
		
	}

}
