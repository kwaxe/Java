
public class AudioCD extends SalesItem {

	private String artist;
	private String label;
	private int playTime;
	
	public AudioCD(int code, String title, double price, int quantity, String artist, String label, int playTime) {
		super(code, title, price, quantity);
		this.artist = artist;
		this.label = label;
		this.playTime = playTime;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Artist: " + artist + "\n";
		str += "Label: " + label + "\n";
		str += "Playtime: " + playTime + "\n";
		return str;
	}
	
	
	
	
	
	

}
