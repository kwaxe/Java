
public class Driver {

	public static void main(String[] args) {
		
		
		Cart c1 = new Cart(5);
		
		Book b = new Book();
		Dictionary d = new Dictionary();
		AudioCD acd = new AudioCD();
		
		c1.addItem("DragonBall, Vol.1", 17.99, 2, c1);
		c1.addItem("Websters Dic 3rd", 90.65, 4, d);
		c1.addItem("Great Tunes", 10.99, 5, acd);
		
		System.out.println();
		

	}

}
