package application;
	
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	private static final String String = null;

	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			//ObservableList<String> ob =FXCollections.observableArrayList("java","php","html");
			
			//ListView<String> list = new ListView(ob);
			ListView<String> list = new ListView();
			list.getItems().addAll("javafx","php","java");
			
			list.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov ,String old, String newv)->{
				System.out.println(old);
				System.out.println(newv);
				
			} );
			
			root.getChildren().add(list);
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
