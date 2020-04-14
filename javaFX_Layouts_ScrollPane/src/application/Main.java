package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			WebView browser = new WebView();
			WebEngine we = browser.getEngine();
			
			ScrollPane sc = new ScrollPane();
			sc.setContent(browser);
			
			we.loadContent("<h1> hello layout </h1>");
			VBox vb = new VBox(10);
			vb.getChildren().add(sc);
			Scene scene = new Scene(vb,400,400);
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
