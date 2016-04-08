
public class Cylinder extends Shape {
	
	//Instance Variables 
	private double radius;
	private double height;
	
	//Constructor using the super class to get name and color 
	public Cylinder(String shapeName, String color, double radius, double height) {
		super(shapeName, color);
		this.radius = radius;
		this.height = height;
	}

	//gets radius 
	public double getRadius() {
		return radius;
	}
	//sets radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//gets height
	public double getHeight() {
		return height;
	}
	//sets height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//method of overriding the area 
	public double area(){
		double a;
		a = Math.PI * Math.pow(radius, 2) * height;
		return a;
	}

	@Override
	public String toString() {
		
		String message = "";
		message += super.toString();
		message += "Radius: " + radius + "\n";
		message += "Height: " + height + "\n";
		return message;
	}
	
	

}
