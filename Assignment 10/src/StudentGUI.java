



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentGUI extends Application {

	@Override
	public void start(Stage primaryStage){
		
		
		Button searchButton = new Button("Search");
		Scene window = new Scene(searchButton, 400, 400); 
		primaryStage.setTitle("Student Interface");
		primaryStage.setScene(window);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
