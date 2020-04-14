package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn = new Button("hellow udemy");
			btn.setLayoutX(20);
			btn.setLayoutY(30);
			
			Pane root = new Pane();
			Scene scene = new Scene(root,200,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			root.getChildren().addAll(btn);
			
			/*btn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("exitoso btn");
				}
				
			}); forma antigua de hacer metodos a cualquier boton*/
			
			btn.setOnAction(e -> {
				System.out.println("hola java fx");
				onEvent(btn);
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void onEvent(Button btn) {
		btn.setText("hola javafx");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
