package scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		Scene scene = new Scene(root,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
