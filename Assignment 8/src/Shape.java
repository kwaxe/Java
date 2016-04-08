import java.text.DecimalFormat;

public class Shape {
	
	//Instance variables
	private String shapeName;
	private String color;
	
	public Shape(){}
	
	//Constructor
	public Shape(String shapeName, String color){
		
		this.shapeName = shapeName;
		this.color = color;
	}
	//get shape name
	public String getShapeName() {
		return shapeName;
	}
	
	//Sets the shape name
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	//gets the color
	public String getColor() {
		return color;
	}
	
	//sets the color 
	public void setColor(String color) {
		this.color = color;
	}
	
	//method for area overriding
	public double area(){	
		return 0;
	}
	
	@Override
	//to string method for output
	public String toString() {
		
		//Formatting the text
		DecimalFormat df = new DecimalFormat("##.##");
		
		String message = "";
		message += "Name: " + getShapeName() + "\n";
		message += "Color: " + getColor() + "\n";
		message += "Area: " + df.format(area()) + "\n";
		return message;
		
	}
	
	
}
