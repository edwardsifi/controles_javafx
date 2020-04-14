package application;
	
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
			//HBox root = new HBox();
			Scene scene = new Scene(root,400,400);
			
			/*ToggleGroup group = new ToggleGroup(); 
			
			RadioButton btn = new RadioButton("male"); 
			btn.setToggleGroup(group);
			btn.setSelected(true);
			
			RadioButton btn1 = new RadioButton("female"); 
			btn1.setToggleGroup(group);
			
			RadioButton btn2 = new RadioButton("other"); 
			btn2.setToggleGroup(group);
			
			
			group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

				@Override
				public void changed(ObservableValue<? extends Toggle> gp, Toggle old_t, Toggle new_t) {
					// TODO Auto-generated method stub
					System.out.println("olg_toggle : "+ old_t);

					System.out.println("new_toggle : "+ new_t);
					
				}
				
			});
			
			root.getChildren().addAll(btn,btn1,btn2);
			*/
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
