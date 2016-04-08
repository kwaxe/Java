/**
 * 
 */

/**
 * @author Kweku Kwabi
 *
 */
public class Invoice {
	
	private String customerName;
	private int numItems;
	
	private InvoiceLine line1;
	private InvoiceLine line2;
	private InvoiceLine line3;
	private InvoiceLine line4;
	
	//Constructor takes one input parameter that represents customer name
	public Invoice(String customerName) {
		this.customerName = customerName;
		this.numItems = 0;		
		this.line1 = null;
		this.line2 = null;
		this.line3 = null;
		this.line4 = null;
	}

	//Gets the customer name
	public String getCustomerName() {
		return customerName;
	}

	//Sets this customer name to customer name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public int getNumItems() {
		return numItems;
	}


	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}


	public InvoiceLine getLine1() {
		return line1;
	}


	public void setLine1(InvoiceLine line1) {
		this.line1 = line1;
	}


	public InvoiceLine getLine2() {
		return line2;
	}


	public void setLine2(InvoiceLine line2) {
		this.line2 = line2;
	}


	public InvoiceLine getLine3() {
		return line3;
	}


	public void setLine3(InvoiceLine line3) {
		this.line3 = line3;
	}


	public InvoiceLine getLine4() {
		return line4;
	}


	public void setLine4(InvoiceLine line4) {
		this.line4 = line4;
	}
	
	//Adds a line to the invoice
	public void addLine(InvoiceLine l){
		
		if(this.numItems == 0)
			this.line1 = l;		
		
		else if(this.numItems == 1)
			this.line2 = l;		
		
		else if(this.numItems == 2)
			this.line3 = l;		
		
		else if(this.numItems == 3)
			this.line4 = l;	
		
		//else
			//System.out.println("Error: Each invoice can only contain a max of 4 lines" + "\n");
		
		this.numItems++;
	}
	
	//Adds line to the invoice
	public void addLine(int iNum, String iDesc, double iPrice, int q){	
		InvoiceLine inv0 = new InvoiceLine(0, "", 0.0, 0);	
		
		addLine(inv0);			
	}
	
	//Gets the invoice total from each of the lines if it is not null
	public double getInvoiceTotal(){
		
		double total = 0;
		
		if(line1 != null)
			total = total + this.line1.getLineTotal();
		
		if(line2 != null)
			total = total + this.line2.getLineTotal();
		
		if(line3 != null)
			total = total + this.line3.getLineTotal();
		
		if(line4 != null)
			total = total + this.line4.getLineTotal();
		
		return total;
	}
	
	//Puts the results in a string to be displayed from driver class
	public String toString(){
		
		String message = "";	
		
		if(this.numItems > 4){
			System.out.println();
			System.out.println("Error: Each invoice can contain a max of 4 lines");
			message += "Customer: " + this.customerName + "\n";
		}
		else{	
			message += "Customer: " + this.customerName + "\n";
			
			if(this.line1 != null)
				message += this.line1 + "\n" + "\n";	
			
			if(this.line2 != null)
				message += this.line2 + "\n" + "\n";
			
			if(this.line3 != null)
				message += this.line3 + "\n" + "\n";
			
			if(this.line4 != null)
				message += this.line4 + "\n" + "\n";
			
			message += "Total Invoice Amount: $" + this.getInvoiceTotal() + "\n";
		}
		return message;		
	}
}
