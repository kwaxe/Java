import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Calculator extends Application{
	
	TextField input1;
	TextField input2;
	TextField result;
	
	
	
	public static void main(String[] args){

		Application.launch(args);
	}
	
	public void start(Stage primaryStage){

		Label label1 = new Label("Number 1:");
		Label label2 = new Label("Number 2:");
		Label label3 = new Label("Result:");
		input1 = new TextField();
		input2 = new TextField();
		result = new TextField();
		
		
		HBox pane1 = new HBox();
		pane1.getChildren().add(label1);
		pane1.getChildren().add(input1);
		pane1.getChildren().add(label2);
		pane1.getChildren().add(input2);
		pane1.getChildren().add(label3);
		pane1.getChildren().add(result);
		
		
		Button addBtn = new Button("Add");
		Button subtractBtn = new Button("Subtract");
		Button multiplyBtn = new Button("Multiply");
		Button divideBtn = new Button("Divide");
		
		
		AddListenerClass addListener = new AddListenerClass();
		addBtn.setOnAction(addListener);
		
		HBox pane2 = new HBox();
		pane2.getChildren().add(addBtn);
		pane2.getChildren().add(subtractBtn);
		pane2.getChildren().add(multiplyBtn);
		pane2.getChildren().add(divideBtn);
		
		VBox frame = new VBox(30);
		frame.getChildren().add(pane1);
		frame.getChildren().add(pane2);
		
		Scene scene = new Scene(frame,700,100);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	class AddListenerClass implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e){
			String str1 = input1.getText();
			String str2 = input2.getText();
			
			
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int resultNum = num1+num2;
			
			result.setText(""+resultNum);
			
			
			
			
		}
	}

}
