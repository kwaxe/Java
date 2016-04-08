import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Kweku Kwabi
 * Assignment 3 Q:2 
 * Due: 02/05/2016
 * 
 * This program asks the user to enter the number of precincts 
 * to count the number of votes for each candidate and will
 * output the results 
 */
public class BallotCounter {
	
	static void main(String[] args) {
		
		//Create scanner objects for user input
		Scanner input = new Scanner(System.in);
		
		//Initialize votes
		int tichenVotes = 0;
		int oratorVotes = 0; 
		
		//Initialize total number of votes
		int totalTichenVotes = 0;
		int totalOratorVotes = 0;
		int totalVotes = 0;
		
		//Initialize precincts
		int tichenPrecinct = 0;
		int oratorPrecinct = 0;
		int tiePrecinct = 0;
		
		//Initialize candidate percentage
		double tichenPercent = 0;
		double oratorPercent = 0;
		
		//Get number of precincts from user input
		System.out.print("Number of precincts: ");
		int precinct = input.nextInt();
		
		
		for(int i = 1; i <= precinct; i++){
			
			System.out.println("Precinct " + i + ": ");

			System.out.print("Votes for Poly Tichen: ");
			tichenVotes = input.nextInt();
			
			System.out.print("Votes for Ernest Orator: ");
			oratorVotes = input.nextInt();
			
			//Increments the number of precincts 
			//depending on the person who has the most votes
			if(tichenVotes > oratorVotes)
				tichenPrecinct++;	
			else if(tichenVotes < oratorVotes)
				oratorPrecinct++;				
			else
				tiePrecinct++;
			
			//Adds the total number of candidate votes
			totalTichenVotes = totalTichenVotes + tichenVotes;
			totalOratorVotes = totalOratorVotes + oratorVotes;
		}	
		
		//Adds to total number of votes 
		totalVotes = totalOratorVotes + totalTichenVotes;
		
		//Calculates the percentage of votes 
		tichenPercent = (double) totalTichenVotes/totalVotes * 100;
		oratorPercent = (double) totalOratorVotes/totalVotes * 100;
		
		//Formats numbers to one decimal place
		DecimalFormat percent = new DecimalFormat("#.#");
		
		//Prints results with percentage
		System.out.println();
		System.out.println("Results: \n");
		System.out.println("Total votes for Polly Tichen: " + totalTichenVotes + " (" + percent.format(tichenPercent) + "%" + ")");		
		System.out.println("Total votes for Ernest Orator: " + totalOratorVotes + " (" + percent.format(oratorPercent) + "%" + ")");
		
		//Prints Results
		if(totalTichenVotes > totalOratorVotes)	
			System.out.println("Winner: Poly Tichen");
		else if(totalTichenVotes < totalOratorVotes)
			System.out.println("Winner: Ernest Orator");
		else
			System.out.println("Tie: No winner");

		//Prints results
		System.out.println("Number of precincts won by Tichen: " + tichenPrecinct);
		System.out.println("Number of precincts won by Orator: " + oratorPrecinct);
		System.out.println("Number of precincts with tie: " + tiePrecinct);


	}
}
