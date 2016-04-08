
public class User {
	
	private String name;
	private String email;
	private PlayList favoriteSongs;
	
	//Constructor
	public User(String name, String email, PlayList favoriteSongs) {
		this.name = name;
		this.email = email;
		this.favoriteSongs = favoriteSongs;
	}

	//Constructor 
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	//Gets the user name 
	public String getName() {
		return name;
	}
	
	//Sets the playlist 
	public void setPlayList(PlayList list){
		this.favoriteSongs = list;
	}
	
	
	//Returns the title of the song that is located at location pos in the playlist
	//if ouptut is empty string if pos is not valid 
	public String getSongTitle(int pos){
		
		String title = favoriteSongs.getSongList()[pos].getTitle();	
		if(title != null){
			return title;
		}
		return null;
	}
	
	//Adds song returns -1 if list is full
	public int addSong(String title, String filePath, String artist){	
	
		for(int i = 0; i < favoriteSongs.getSongList().length; i++){
			if(favoriteSongs.getNumOfSongs() > favoriteSongs.getSongList().length){
				System.out.println("List is full");
				return -1;				
			}				
		}
		favoriteSongs.addSong(title, filePath, artist);
		return 0;
		
	}
	
	//Counts the total of songs by the artist in the play list
	public int artistSongCount(String artist){
		int count = 0; 
		for(int i = 0; i < favoriteSongs.getSongList().length; i++){		
			if(this.favoriteSongs.getSongList()[i].getArtist() == artist){
				count++;
			}
		}
		return count;
	}
	
	//toString method 
	public String toString() {
		String message = "";
		message += "Name: " + name + "\n";
		message += "Email: " + email + "\n";
		message += "\nFavorite Songs \n" + favoriteSongs + "\n"; 	
		return message;
	}
	
	

}
