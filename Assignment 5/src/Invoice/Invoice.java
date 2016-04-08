package Invoice;

public class Invoice {
	
	private int partNum;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Invoice(){	
		partNum = 0;
		partDesc = null;
		quantity = 0;
		price = 0.0;		
	}

	public int getPartNum() {
		return partNum;
	}

	public void setPartNum(int partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount(int quantity, double price){		
		return quantity * price;
	}
	
	public String toString(){
		String message = "Part Number: " + partNum  + "\n" +
						 "Part Desc: " +	partDesc + "\n" +
						 "Quantity: " + quantity + "\n" +
						 "Price: $" + price + "\n" +
						 "Total Amount: $" + getInvoiceAmount(quantity, price);	
		return message;
	}
	
	

}
