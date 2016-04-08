
public class Driver {

	public static void main(String[] args) {
		
		//Creates a new play list for 5 songs
		PlayList playlist1 = new PlayList(5);
		
		//Add 3 songs to the play list
		playlist1.addSong("My Song 1", "../music/", "Artist One");
		playlist1.addSong("My Song 2", "../music/", "Artist One");
		playlist1.addSong("My Song 3", "../music/", "Artist Two");
		
		//Add two users 
		User user1 = new User("Kweku", "Kweku@Email.com");
		User user2 = new User("Kwabi", "Kwabi@Email.com");
		
		//Set play list for both users 
		user1.setPlayList(playlist1);
		user2.setPlayList(playlist1);
		
		//Have both users add song to play list 
		user1.addSong("User 1 - Song", "../music/", "Man One");
		user2.addSong("User 2 - Song", "../music/", "Man Two");
		//user2.addSong("User 2 - Song", "../music/", "Man Two");

	
		//Prints each users play list 
		System.out.println(user1);
		System.out.println(user2);
		
		//Gets the users name for output 
		String user1Name = user1.getName();
		String user2Name = user2.getName();	
		
		//Prints results 
		System.out.println();
		System.out.println(user1Name + ", asks how many songs does Artist One have? ");
		System.out.println("Total Songs by 'Artist One': " + user1.artistSongCount("Artist One"));
		System.out.println();
		System.out.println(user2Name + ", says the first song in the playlist is: " + playlist1.getSong(0).getTitle());
		System.out.println(user2Name + ", says the position of 'My Song 1' is: " + playlist1.getSongByTitle("My Song 1"));
		
		
		
	}

}
