package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox hb = new HBox(10);
			hb.setPadding(new Insets(10.,10,20,10));
			Button btn = new Button("click");
			Button btn1 = new Button("click me");
			
			hb.getChildren().addAll(btn,btn1);
			
			Scene scene = new Scene(hb,400,400);
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
