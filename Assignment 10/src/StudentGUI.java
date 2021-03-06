
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
import javafx.scene.layout.StackPane;
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
	VBox insertPane;
	VBox searchPane;
	
	Label insertLabel;
	Label searchLabel;
	Label homeLabel;
	
	Stage window;
	
	TextField id_TF;
	TextField name_TF;
	TextField age_TF;
	TextField gpa_TF;
	
	TextField id_res;
	Label name_res;
	Label age_res;
	Label gpa_res;

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
	
	public void submitButtonClicked(ActionEvent ae){
		
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
		
		
		
		//Insert Label
		Label idLabel = new Label("ID:");
		Label nameLabel = new Label("Name:");
		Label ageLabel = new Label("Age:");
		Label gpaLabel = new Label("GPA:");

		//Insert Text field
		id_TF = new TextField("Enter ID");
		name_TF = new TextField("Enter Name");
		age_TF = new TextField("Enter age");
		gpa_TF = new TextField("Enter GPA");

		//Search Label
		Label search_Id = new Label("Enter ID");
		Label searchAgeLabel = new Label("Age:");
		Label searchGpaLabel = new Label("GPA:");
		
		id_res = new TextField("Enter ID");
		name_res = new Label();
		age_res = new Label();
		gpa_res = new Label();
		
		//Button homeButtonScene = null;
		
		//this.homeButtonScene = homeButtonScene;
		
		insertButtonScene.setOnAction(ae-> ButtonClicked(ae));
		searchButtonScene.setOnAction(ae-> ButtonClicked(ae));
		homeButtonScene.setOnAction(ae-> ButtonClicked(ae));
		
		homePane  = new HBox();
		insertPane = new VBox();
		searchPane = new VBox();
		
		Button submit = new Button("Submit");
			
		insertScene = new Scene(insertButtonScene, 300, 300);
		searchScene = new Scene(searchButtonScene, 300, 300);
		homeScene = new Scene(homeButtonScene, 300, 300);
		
		homePane.getChildren().addAll(insertButtonScene, searchButtonScene);
		insertPane.getChildren().addAll(insertLabel, homeButtonScene, idLabel, id_TF, nameLabel, name_TF, ageLabel, age_TF, gpaLabel, gpa_TF, submit);
		searchPane.getChildren().addAll(searchLabel, id_res, name_res, age_res, gpa_res);
		
		homeScene = new Scene(homePane, 300, 300);
		insertScene = new Scene(insertPane, 300, 300);
		searchScene = new Scene(searchPane, 300, 300);
		
		primaryStage.setTitle("Student Interface");
		primaryStage.setScene(homeScene);
		primaryStage.show();
		
		searchButtonScene.setPrefWidth(250);			
		insertButtonScene.setPrefWidth(250);
		
		SubmitListenerClass submitListener = new SubmitListenerClass();	
		submit.setOnAction(submitListener);
					
	} 



	class SubmitListenerClass implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent ae) {
			
			System.out.println("Submit Button Clicked");
			
			String id = id_TF.getText();
			String name = name_TF.getText();
			String age = age_TF.getText();
			String gpa = gpa_TF.getText();
			
			System.out.println(id + name + age + gpa);
			
			name_res.setText(name);
			age_res.setText(age);
			gpa_res.setText(gpa);
		}	
	}
}







