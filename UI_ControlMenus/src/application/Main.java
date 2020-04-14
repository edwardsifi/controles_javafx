package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			MenuBar mbr = new MenuBar();
			Menu menu  = new Menu("file");
			
			menu.getItems().add(new MenuItem("new"));
			menu.getItems().add(new MenuItem("open file"));
			menu.getItems().add(new MenuItem("close"));
			menu.getItems().add(new SeparatorMenuItem());
			menu.getItems().add(new MenuItem("exit"));
 			
			mbr.getMenus().add(menu);
			root.getChildren().add(mbr);
			
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
