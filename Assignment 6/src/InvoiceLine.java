/**
 * 
 */

/**
 * @author Kweku Kwabi
 *
 */
public class InvoiceLine {

	private Item itemSold;	
	private int quantity;
	
	//Constructor that takes 4 parameters 	
	public InvoiceLine(int itemNum, String itemDesc,  double itemPrice, int quantity) {			
		this.itemSold = new Item(itemNum, itemDesc, itemPrice); //creates itemSold obj and stores 3 parameters
		this.quantity = quantity;	
	}

	public Item getLineItem() {
		return itemSold;
	}

	public void setLineItem(Item lineItem) {
		this.itemSold = lineItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//returns each line total 
	public double getLineTotal(){
		double total = this.itemSold.getItemPrice() * this.getQuantity();
		return total;
	}
	
	//Puts results in a string 
	public String toString() {
		String message = "";
		message +=  "Quantity: " + this.quantity + "\n";
		message += this.itemSold.toString() + "\n";
		message += "Total: $" + this.getLineTotal();
		return message;
	}
}
