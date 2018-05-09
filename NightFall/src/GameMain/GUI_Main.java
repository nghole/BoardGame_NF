package GameMain;

import java.awt.CardLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI_Main extends Application {
	// 한 유저에게 방의 목록은 하나만 있으면 되므로
	private static GUI_Main _instance;

	public static GUI_Main getInstance(){
		if(_instance == null) _instance = new GUI_Main();
		return _instance;
	}

	private CardLayout panels = new CardLayout();

	private GUI_Main(){
		launch();
		/*
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("해상도 : " + res.width + " x " + res.height);
		this.setSize(res.width, res.height);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		gd.setFullScreenWindow(this);
		getContentPane().setLayout(panels);
		getContentPane().add("Ingame", GUI_Ingame.getInstace());
		getContentPane().add("Robby", GUI_Robby.getInstace());
		getContentPane().add("Waitingroom", GUI_Waitingroom.getInstace());
		panels.show(this.getContentPane(), "Robby");

		this.repaint();
		this.setVisible(true);*/
	}

	@Override
	public void start(Stage arg0) throws Exception{
		// TODO Auto-generated method stub primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        arg0.setScene(new Scene(root, 300, 250));
        arg0.show();
		
	}
}
