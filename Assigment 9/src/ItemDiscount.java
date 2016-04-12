
public class ItemDiscount {
	
	private int discount;	
	private int qualifiedQuantity;

	public ItemDiscount(int discount, int qualifiedQuantity) {
		this.discount = discount;
		this.qualifiedQuantity = qualifiedQuantity;
	}
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQualifiedQuantity() {
		return qualifiedQuantity;
	}

	public void setQualifiedQuantity(int qualifiedQuantity) {
		this.qualifiedQuantity = qualifiedQuantity;
	}

	public double calculateDiscount(SalesItem si){
		
		double discountAmount = 0;
		double discount = getDiscount()/100;
		
		if(si.getQuantity() >= qualifiedQuantity){
			discountAmount = si.itemTotalCost() - discount; 
		}
		
		return discountAmount;
		
	}

}
