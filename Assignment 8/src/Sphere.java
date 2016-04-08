
public class Sphere extends Shape {
	
	//Instance variable
	private double radius;
	
	//Constructor using super to get name and color
	public Sphere(String shapeName, String color, double radius) {
		super(shapeName, color);
		this.radius = radius;
	}
	
	//Get radius
	public double getRadius() {
		return radius;
	}
	
	//Set radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Override area
	public double area(){
		double a = 4 * Math.PI * Math.pow(radius, 2);
		return a;
		
	}
	
	//To string method for output
	@Override
	public String toString() {
		
		String message = "";
		message += super.toString();
		message += "Radius: " + radius + "\n";
		
		return message;
	}
	
	

}
