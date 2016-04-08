
public class ShapesDriver {

	public static void main(String[] args) {
		
		//Instantiate 3 shape objects
		Rectangle deck = new Rectangle("Deck", "Red", 20, 20);
		Sphere bigBall = new Sphere("Big Ball", "Blue", 15);
		Cylinder tank = new Cylinder("Tank", "White", 10, 30);
		
		//Array to hold 5 objects
		Shape[] shapes = new Shape[5];
		
		//Assigning the 3 shape objects to shapes array
		shapes[0] = deck;
		shapes[1] = bigBall;
		shapes[2] = tank;
		
		//Creating 2 shape objects while being placed shapes array
		shapes[3] = new Sphere("Earth", "Green", 3959);
		shapes[4] = new Sphere("Mars", "Orange", 2106);
		
		//Prints out shape data
		for(int i = 0; i < shapes.length; i++){	
			System.out.println(shapes[i]);	
		}
	
	}
}
