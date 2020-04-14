package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane bp = new BorderPane();
			bp.setPadding(new Insets(10,10,20,30));
			
			Button btnTop = new Button("Top");
			bp.setTop(btnTop);
			
			Button btnBottom = new Button("Bottom");
			bp.setBottom(btnBottom);
			
			Button btnLeft = new Button("Left");
			bp.setLeft(btnLeft);
			
			Button btnRight = new Button("Right");
			bp.setRight(btnRight);
			
			Button btnCenter = new Button("Center");
			bp.setCenter(btnCenter);
			
			Scene scene = new Scene(bp,400,400);
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
