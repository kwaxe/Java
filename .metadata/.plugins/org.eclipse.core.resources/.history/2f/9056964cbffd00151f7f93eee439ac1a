
public class Dictionary extends Book {

	private String language;
	private int numDef;
	
	public Dictionary(){
		
	}
	
	public Dictionary(int code, String title, double price, int quantity, String author, int numPages, String language, int numDef) {
		super(code, title, price, quantity, author, numPages);
		this.language = language;
		this.numDef = numDef;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumDef() {
		return numDef;
	}

	public void setNumDef(int numDef) {
		this.numDef = numDef;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Language: " + language;
		str += "# Definition: " + numDef;
		return str;
	}
	
	//Method returns number of def on avg for each page.. numDef / pages
	public double getRatio(){
		
		//double avgDef = 0;	
		
		double avgDef = getNumDef() / super.getNumPages();		
		return avgDef;
	}
	
	
	
	
	


}
