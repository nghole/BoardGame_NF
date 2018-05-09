package Game.Control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UIController {
	@FXML Button bt_login;
	@FXML TextField tb_id;
	@FXML TextField tb_pw;
	
	
	@FXML
	private void login(ActionEvent e) {
		System.out.println("ÀßµÇ³Ä");
		bt_login.setScaleX(100);
	}

}
