
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentGUI extends Application {
	
	Scene searchScene;
	Scene insertScene;
	Scene homeScene;
	
	Button insertButtonScene;
	Button searchButtonScene;
	Button homeButtonScene;
	
	HBox homePane;
	HBox insertPane;
	HBox searchPane;
	
	Label insertLabel;
	Label searchLabel;
	Label homeLabel;
	
	Stage window;

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void ButtonClicked(ActionEvent ae){
		if(ae.getSource() == insertButtonScene){
			window.setScene(insertScene);
		}
		else if(ae.getSource() == searchButtonScene){
			window.setScene(searchScene);
		}
		else if(ae.getSource() == homeButtonScene){
			window.setScene(homeScene);
		}
	}

	@Override
	public void start(Stage primaryStage){
		
		window = primaryStage;
		
		insertLabel = new Label("Welcome to the Insert Student Page");
		searchLabel = new Label("Welcome to the Search Student Page");
		homeLabel   = new Label("Welcome to the Home Page");
		
		insertButtonScene = new Button("Insert Student");
		searchButtonScene = new Button("Search Student");
		homeButtonScene = new Button("Home");
		
		insertButtonScene.setOnAction(ae-> ButtonClicked(ae));
		searchButtonScene.setOnAction(ae-> ButtonClicked(ae));
		homeButtonScene.setOnAction(ae-> ButtonClicked(ae));
		
		homePane  = new HBox();
		insertPane = new HBox();
		searchPane = new HBox();
			
		insertScene = new Scene(insertButtonScene, 500, 300);
		searchScene = new Scene(searchButtonScene, 500, 300);
		homeScene = new Scene(homeButtonScene, 500, 300);
		
		homePane.getChildren().addAll(homeLabel, insertButtonScene, searchButtonScene);
		insertPane.getChildren().add(insertLabel);
		searchPane.getChildren().add(searchLabel);
		
		homeScene = new Scene(homePane, 500, 300);
		insertScene = new Scene(insertPane, 500, 300);
		searchScene = new Scene(searchPane, 500, 300);
		
		primaryStage.setTitle("Student Interface");
		primaryStage.setScene(homeScene);
		primaryStage.show();
		
		//Two Buttons Created
//		Button searchButton = new Button("Search Student");
//		Button insertButton = new Button("Insert Student");
//		searchButton.setPrefWidth(Double.MAX_VALUE);		
//		searchButton.setMaxHeight(Double.MAX_VALUE);		
//		insertButton.setPrefWidth(Double.MAX_VALUE);
//		insertButton.setMaxHeight(Double.MAX_VALUE);
		
		//Defining interface
//		HBox hb = new HBox();	
//		hb.getChildren().add(insertButton);
//		hb.getChildren().add(searchButton);		
//		Scene scene = new Scene(hb, 500, 300); 
//		primaryStage.setTitle("Student Interface");
//		primaryStage.setScene(scene);
//		primaryStage.show();
		
		
		//Defining actions
		InsertListenerClass insertListen = new InsertListenerClass();
		SearchListenerClass searchListen = new SearchListenerClass();	
		//insertButton.setOnAction(insertListen);
		//searchButton.setOnAction(searchListen);
		
		//insertButton.setOnAction(e -> window.setScene(insertScene));
		//searchButton.setOnAction(e -> window.setScene(searchScene));
		
		//Layout - Layout in vertical column
		//VBox vb1 = new VBox(20); //spaced out 20px
		//vb1.getChildren().addAll(insertStudentLabel);
		//insertScene = new Scene(vb1, 500, 300);
		
		//VBox vb2 = new VBox(20); //spaced out 20px
		//vb2.getChildren().addAll(searchStudentLabel);
		//searchScene = new Scene(vb2, 500, 300);
		
		//window.setScene(searchScene);
		
	} 
}


class InsertListenerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent ae) {
		
		System.out.println("Insert Button Clicked");	
	}	
}

class SearchListenerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent ae) {
		System.out.println("Search Button Clicked");		
	}
}





