import acsse.csc2a.model.MyPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author kgosi
 *
 */
public class Main extends Application{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
    launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MyPane mypane = new MyPane();
		//place my pane into a scene
		Scene scene=new Scene(mypane);
		
		//setup stage
		primaryStage.setTitle("Message Map");
		primaryStage.setScene(scene);
		//Display stage
		primaryStage.show();
	}

}
