

public class PlayList {
	
	
	private int numOfSongs;
	private Song[] songList;
	
	//Constructor 
	public PlayList(int maxNumOfSongs) {

		this.numOfSongs = 0;
		this.songList = new Song[maxNumOfSongs];
		
	}
	
	//adds a song to the playlist taking 3 params
	public void addSong(String title, String filePath, String artist){
		
		Song s = new Song(title, filePath, artist);
		addSong(s);
	}
	
	//Method overloading with new obj s
	public void addSong(Song s){
	
		songList[this.numOfSongs] = s;
		this.numOfSongs++;
	}
	
	//Gets entire song list and returns it
	public Song[] getSongList(){
		return songList;
	}
	
	//Gets the number of songs 
	public int getNumOfSongs(){
		
		return numOfSongs;
	}
	
	//Gets the songs position based on the length of the list 
	public Song getSong(int pos){
		
		if(pos <= this.songList.length)
			return this.songList[pos];	
		else
			return null;
	}
	
	//Takes the name of the song and returns the songs position
	public int getSongByTitle(String title){
		
		int songPos = -1;
		
		for(int i = 0; i < this.numOfSongs; i++)
			if(this.songList[i].getTitle() == title)
				songPos = i;	
		return songPos;
	}

	//Displays a string method 
	public String toString() {
		
		String message = "";
		
		//Displays all songs in play list
		for(int i = 0; i < this.numOfSongs; i++ )
			message += "\n" + this.songList[i];
		
		message += "Number of songs: " + numOfSongs;
		return message;
	}

}
