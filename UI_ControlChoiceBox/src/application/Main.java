package application;
	
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			ObservableList<String> List = FXCollections.observableArrayList("php", "databases", "css");
			ChoiceBox choise = new ChoiceBox(List);
			//choise.getItems().addAll("java","javafx","html");
			choise.getSelectionModel().selectedItemProperty().addListener((ObservableValue ob, Object oldValue, Object newValue)->{
				System.out.println((String)oldValue);
				System.out.println((String)newValue);
			});
			
			root.getChildren().add(choise);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
