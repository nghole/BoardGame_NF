package GameMain;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Start extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		Parent root = null;
		try{
			root = FXMLLoader.load(getClass().getResource("/test.fxml"));
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();
	     Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	     Scene scene = new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());	  
	     primaryStage.setScene(scene);
	     primaryStage.show();
	}

}
