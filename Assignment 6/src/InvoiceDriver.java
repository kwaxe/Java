/**
 * 
 */

/**
 * @author Kweku Kwabi
 *
 */
public class InvoiceDriver {

	public static void main(String[] args) {
		
		//Invoice 1 has 4 lines 
		Invoice inv1 = new Invoice("Kweku Kwabi");
		InvoiceLine i1L1 = new InvoiceLine(431, "Electronics", 15.75, 2);
		InvoiceLine i1L2 = new InvoiceLine(2342, "Electronics", 95.75, 4);
		InvoiceLine i1L3 = new InvoiceLine(345, "Electronics", 25.75, 6);
		InvoiceLine i1L4 = new InvoiceLine(3454, "Electronics", 25.75, 8);
		inv1.addLine(i1L1);
		inv1.addLine(i1L2);
		inv1.addLine(i1L3);
		inv1.addLine(i1L4);
	
		
		//Invoice 2 has 5 lines and will display an error
		Invoice inv2 = new Invoice("Hillary Clinton");
		InvoiceLine i2L1 = new InvoiceLine(4731, "Home and Office", 15.75, 2);
		InvoiceLine i2L2 = new InvoiceLine(2342, "Home and Office", 5.75, 4);
		InvoiceLine i2L3 = new InvoiceLine(4785, "Home and Office", 25.5, 6);
		InvoiceLine i2L4 = new InvoiceLine(584,  "Home and Office", 5.5, 8);
		InvoiceLine i2L5 = new InvoiceLine(7874, "Home and Office", 95.75, 2);	
		inv2.addLine(i2L1);
		inv2.addLine(i2L2);
		inv2.addLine(i2L3);
		inv2.addLine(i2L4);
		inv2.addLine(i2L5);
		
		//Invoice 3 has 4 lines 
		Invoice inv3 = new Invoice("Barack Obama");
		InvoiceLine i3L1 = new InvoiceLine(4731, "Automobile", 15.75, 2);
		InvoiceLine i3L2 = new InvoiceLine(2342, "Automobile", 95.75, 4);
		InvoiceLine i3L3 = new InvoiceLine(34785, "Automobile", 25.75, 6);
		inv3.addLine(i3L1);
		inv3.addLine(i3L2);
		inv3.addLine(i3L3);
		
		//Invoice 4 has 3 lines 
		Invoice inv4 = new Invoice("Donald Trump");
		InvoiceLine i4L1 = new InvoiceLine(4731, "Console", 15.75, 2);
		InvoiceLine i4L2 = new InvoiceLine(2342, "Console", 95.75, 4);
		inv4.addLine(i4L1);
		inv4.addLine(i4L2);

		//Print results 
		System.out.println(inv1);
		System.out.println("-----------------------------");
		System.out.println(inv2);
		System.out.println("-----------------------------");
		System.out.println(inv3);
		System.out.println("-----------------------------");
		System.out.println(inv4);

	}

}
