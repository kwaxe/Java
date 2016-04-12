import java.util.ArrayList;

public class Cart {

	private int numItems; // Current number of items in cart
	//private SalesItem[] itemList;
	private int maxNumOfItems;
	private ArrayList<SalesItem> itemList;

	public Cart(int maxNumOfItems) {	
		this.numItems = 0;
		this.maxNumOfItems = maxNumOfItems;
		itemList = new ArrayList<SalesItem>();
		
	}
	
	public void addItem(int code, String title, double price, int quantity, int type){
		
		SalesItem item = new SalesItem(code, title, price, quantity){};
		
		if(numItems <= itemList.size()){
			if(item instanceof Book){
				SalesItem b = new Book(code, title, price, quantity, 
			  			  ((Book) item).getAuthor(), 
			  			  ((Book) item).getNumPages());
				itemList.add(b);
				numItems+=1;
				
			}
			else if(item instanceof Dictionary){
				SalesItem d = new Dictionary(code, title, price, quantity, 
				        ((Dictionary) item).getAuthor(), 
					    ((Dictionary) item).getNumPages(), 
					    ((Dictionary) item).getLanguage(), 
					    ((Dictionary) item).getNumDef());
				itemList.add(d);
				numItems+=1;
				
			}
			else if(item instanceof AudioCD){
				SalesItem acd = new AudioCD(code, title, price, quantity, 
			 		       ((AudioCD) item).getArtist(), 
			 		       ((AudioCD) item).getLabel(), 
			 		       ((AudioCD) item).getPlayTime());
				itemList.add(acd);
				numItems+=1;
			}
		}
	}
	
	public double cartTotalCost(){
		double total = 0;
		for(int i = 0; i < numItems; i++){
			total = total + itemList.get(i).itemTotalCost();
		}
		return total;
	}
	
	public int getNumBooks(){
		int books = 0;
		for(int i = 0; i < itemList.size(); i++){
			if(itemList.get(i).getCode() == 1){
				books += itemList.get(i).getQuantity();
			}
		}
		return books;
	}
	
	public int getNumCDS(){
		int cds = 0;
		for(int i = 0; i < itemList.size(); i++){
			if(itemList.get(i).getCode() == 3){
				cds += itemList.get(i).getQuantity();
			}
		}
		return cds;
	}
	
	@Override
	public String toString(){
		
		String str = "";
		for(int i = 0; i < this.numItems; i++ ){
			str+= "\n" + itemList.get(i).toString() + "\n";
		}
		return str;
	}

}
