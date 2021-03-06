import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

	private int numItems; // Current number of items in cart
	//private int maxNumOfItems;
	private SalesItem[] itemList;
	//private ArrayList<SalesItem> itemList;

	public Cart(int maxNumOfItems) {
		
		this.numItems = 0;	
		this.itemList = new SalesItem[maxNumOfItems];
		
		//SalesItem itemList = new ArrayList<E>();
		//itemList = new ArrayList<SalesItem>();
		
	}
	

	public void addItem(int code, String title, double price, int quantity, int type){
		
		Scanner input = new Scanner(System.in); 
		int max = this.itemList.length;
		
		//if(numItems <= itemList.size()){
		if(this.numItems <= max){
			
			if(type == 1){
				System.out.print("Enter name of Author: ");
				String author = input.nextLine();
				
				System.out.print("Enter the number of pages: ");
				int pages = input.nextInt();
				
				SalesItem b = new Book(code, title, price, quantity, author, pages);
				//itemList.add(b);
				
				itemList[this.numItems] = b;
				//itemList[this.numItems] = b;
				this.numItems++;
			}
				
			else if(type == 2){
				System.out.print("Enter name of Author: ");
				String author = input.nextLine();
				
				System.out.print("Enter the number of pages: ");
				int pages = input.nextInt();
				
				System.out.print("Enter the language: " + "\n");
				String language = input.nextLine();
				
				System.out.print("Enter the number of definitions: ");
				int definitions = input.nextInt();
						
				SalesItem d = new Dictionary(code, title, price, quantity, author, pages, language, definitions);	
				//itemList[this.numItems].equals(d);
				itemList[this.numItems] = d;
				//itemList.add(d);
				numItems++;
				
			}
			else if(type == 3){
				System.out.print("Enter name of Author/Artist: ");
				String author = input.nextLine();
				
				System.out.print("Enter the label: ");
				String label = input.nextLine();
								
				System.out.print("Enter the play time in mins: ");
				int playTime = input.nextInt();
				
				SalesItem acd = new AudioCD(code, title, price, quantity, author, label, playTime);
				//itemList.add(acd);
				itemList[this.numItems] = acd;
				numItems++;
			}
		}
		else{
			System.out.println("Cart is full");
		}
	
	}
	
	public SalesItem[] getItemList() {
		return itemList;
	}

	public void setItemList(SalesItem[] itemList) {
		this.itemList = itemList;
	}

	public double cartTotalCost(){
		double total = 0;
		for(int i = 0; i < this.numItems; i++){
			//total = total + itemList.get(i).itemTotalCost();
			total = total + itemList[i].itemTotalCost();
		}
		return total;
	}
	
	public int getNumBooks(){
		int books = 0;
		for(int i = 0; i < itemList.length; i++){
//			if(itemList.get(i).getCode() == 1){
//				books += itemList.get(i).getQuantity();
//			}
			if(itemList[i].getCode() == 1){
				books += itemList[i].getQuantity();
			}
		}
		return books;
	}
	
	public int getNumCDS(){
		int cds = 0;
		for(int i = 0; i < itemList.length; i++){
//			if(itemList.get(i).getCode() == 3){
//				cds += itemList.get(i).getQuantity();
//			}
			if(itemList[i].getCode() == 3){
				cds += itemList[i].getQuantity();
			}
		}
		return cds;
	}
	
	@Override
	public String toString(){
		
		String str = "";
		for(int i = 0; i < this.numItems; i++ ){
			//str+= "\n" + itemList.get(i) + "\n";
			//str += "\n" + itemList.get(i).toString() + "\n";
			str += "\n" + itemList[i].toString();
		}
		return str;
	}

}
