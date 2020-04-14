package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			Button btn = new Button("load");
			
			btn.setOnAction(e->{
				FileChooser fc = new FileChooser();
				fc.getExtensionFilters().addAll(new ExtensionFilter("Pdf File", "*pdf"));
				File file = fc.showOpenDialog(primaryStage);
				System.out.println(file);
			});
			
			root.getChildren().add(btn);
			
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
