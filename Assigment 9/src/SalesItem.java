
public abstract class SalesItem {
	
	private int code; 
	private String title;
	private double price;
	private int quantity;
	
	public SalesItem(int code, String title, double price, int quantity) {
		this.code = code;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double itemTotalCost(){
		double total = price * quantity;
		return total;
	}
	@Override
	public String toString() {
		String str = "";
		str += "Code: " + code + "\n";
		str += "Title: " + title + "\n";
		str += "Price: " + price + "\n";
		str += "Quantity: " + quantity + "\n";
		return str;
	}
	
	
	

}
