
public class Rectangle extends Shape {
	//Instance variables 
	private double length;
	private double width;
	
	//Constructor using the super class to get shape name and color 
	public Rectangle(String shapeName, String color, double length, double width) {
		super(shapeName, color);
		this.length = length;
		this.width = width;
	}
	
	//gets lenght
	public double getLength() {
		return length;
	}
	
	//sets length
	public void setLength(double length) {
		this.length = length;
	}
	//gets width
	public double getWidth() {
		return width;
	}
	//sets width
	public void setWidth(double width) {
		this.width = width;
	}
	//method for overriding area
	public double area(){
		double a;
		a = length * width;
		return a;
	}

	@Override
	public String toString() {
		
		String message = "";
		message += super.toString();
		message += "Length: " + length + "\n";
		message += "Width: " + width + "\n";
		
		return message;
	}
	
	
}
