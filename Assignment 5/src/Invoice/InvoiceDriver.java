package Invoice;

public class InvoiceDriver {

	public static void main(String[] args) {
		
		Invoice inv = new Invoice();
		
		inv.setPartNum(16);
		inv.setPartDesc("Electronic");
		inv.setQuantity(6);
		inv.setPrice(16.82);
			
		System.out.println(inv);
		

	}

}
