package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox vb = new VBox();
			vb.setSpacing(10);
			vb.setPadding(new Insets(10,20,10,10));
			Button btn = new Button("click me");
			Button btn1 = new Button("click me");
			Button btn2 = new Button("click me");
			Scene scene = new Scene(vb,400,400);
			
			vb.getChildren().addAll(btn,btn1,btn2);
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
