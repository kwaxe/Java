
public class Song {
	
	private String title;
	private String filePath;
	private String artist;
	
	public Song(){
		
	}
	
	//Constructor 
	public Song(String title, String filePath, String artist) {
		this.title = title;
		this.filePath = filePath;
		this.artist = artist;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	//Getter
	public String getArtist() {
		return artist;
	}
	//toString method
	public String toString() {
		
		String output = "";
		output += "Title: " + title + "\n";
		output += "File Path: " + filePath + "\n";
		output += "Artist: " + artist + "\n";
		return output;
	}

	

}
