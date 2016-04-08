/**
 * 
 */

/**
 * @author Kweku Kwabi
 *
 */
public class Item {

	private int itemNum;
	private String itemDesc;
	private double itemPrice;
	
	public Item() {}
	
	//Constructor method
	public Item(int itemNum, String itemDesc, double itemPrice) {
		this.itemNum = itemNum;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	//Puts results in string to be outputed by driver class
	public String toString() {
		
		String message = "";
		message += "Item Number: #" + itemNum + "\n";
		message += "Item Desc: " + itemDesc + "\n";
		message += "Item Price: $" + itemPrice;	
		return message;
	}



}
