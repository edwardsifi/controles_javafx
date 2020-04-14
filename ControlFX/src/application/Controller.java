package application;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.HyperlinkLabel;
import org.controlsfx.control.Rating;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{

	 @FXML
	    private Rating rating;

	 @FXML
	 private HyperlinkLabel msg;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		rating.ratingProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> ov, Number old, Number newT) {
				// TODO Auto-generated method stub
				msg.setText("rating"+newT);
				
			}});
		
	}

}
