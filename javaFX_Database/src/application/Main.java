package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.sql.SQLException;

import DBConnection.connection;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		connection con = new connection();
		
		try {
			Button btn = new Button("Connect to database");
			
			Pane root = new Pane();
			Scene scene = new Scene(root,400,400);
			root.getChildren().addAll(btn);
			
			btn.setOnAction(e ->{
			
					con.getConnection();
				
			});
			
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
