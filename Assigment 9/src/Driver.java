
public class Driver {

	public static void main(String[] args) {
				
		Cart c1 = new Cart(3);
		
		SalesItem[] list = c1.getItemList();
				
		c1.addItem(000, "DragonBall, Vol.1", 17.99, 2, 1);
		c1.addItem(111, "Websters Dic 3rd", 90.65, 4, 2);
		c1.addItem(222, "Great Tunes", 10.99, 5, 3);
		
		System.out.println(c1);
		
	}

}
