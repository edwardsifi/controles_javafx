package AlertMessage;

import javafx.scene.control.Alert;

public class message {
	public void setMessage(String str) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setHeaderText("Alert message");
		alert.setContentText(str);
		alert.show();
		
	}
}
