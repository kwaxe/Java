
public class Driver {

	public static void main(String[] args) {
		
		
		//Cart c1 = new Cart(5);
		Cart[] c1 = new Cart[3];
		
//		Book b = new Book();
//		Dictionary d = new Dictionary();
//		AudioCD acd = new AudioCD();
		

		
		c1[0].addItem(000, "DragonBall, Vol.1", 17.99, 2, 1);
		c1[1].addItem(111, "Websters Dic 3rd", 90.65, 4, 2);
		c1[2].addItem(222, "Great Tunes", 10.99, 5, 3);
		
		System.out.println(c1.toString());
		
	

	}

}
