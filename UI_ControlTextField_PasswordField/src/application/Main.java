package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			TextField txt = new TextField();
			PasswordField pass = new PasswordField();
			Button btn = new Button("click me");
			
			btn.setOnAction( e->{
				System.out.println(txt.getText());
				System.out.println(pass.getText());
			});
			
			root.getChildren().addAll(txt,pass,btn);
			
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
