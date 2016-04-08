
public class Cart {

	private int numItems; // Current number of items in cart
	private SalesItem[] itemList;

	public Cart(int maxNumOfItems) {	
		this.numItems = 0;
		this.itemList = new SalesItem[maxNumOfItems];
		
	}
	
	public void addItem(int code, String title, double price, int quantity, SalesItem type ){
		
		
		if(type instanceof Book){
			Book b = new Book(code, title, price, quantity, "", 0);	
			
			
		}
		else if(type instanceof Dictionary){
			Dictionary d = new Dictionary(code, title, price, quantity, "", 0, "", 0);
			//type.setCode(2);
		}
		else if(type instanceof AudioCD){
			AudioCD acd = new AudioCD(code, title, price, quantity, "", "", 0);
			//type.setCode(3);
		}
	}
	
	public double cartTotalCost(){
		double total = 0;
		for(int i = 0; i < itemList.length; i++){
			total = total + itemList[i].itemTotalCost();
		}
		return total;
	}
	
	public int getNumBooks(){
		int books = 0;
		for(int i = 0; i < itemList.length; i++){
			if(itemList[i].getCode() == 1){
				books++;
			}
		}
		return books;
	}
	
	public int getNumCDS(){
		int cds = 0;
		for(int i = 0; i < itemList.length; i++){
			if(itemList[i].getCode() == 3){
				cds++;
			}
		}
		return cds;
	}
	
	public String toString(){
		
		String str = "";
		for(int i = 0; i < this.numItems; i++ ){
			str+= "\n" + itemList[i];
		}
		return str;
	}

}
