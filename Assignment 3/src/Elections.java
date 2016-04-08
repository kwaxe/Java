import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Kweku Kwabi
 * Assignment 3 Q:1
 * Due 02/05/2016
 */

public class Elections {

	public static void main(String[] args) {
		
		//Create input object
		Scanner input = new Scanner(System.in);
		
		//Initialize variables
		double votesTotal = 0;		
		int tichenVotes = 0; //odd		
		int oratorVotes = 0; //even
		int x = 0; 
		
		//While x is not equal to -1 get user input
		while(x != -1){		
			System.out.print("Enter your vote <Tichen:1, Orator:2, end:-1> ");
			x = input.nextInt();
			
			//If x is equal to 1 or 2 or 3 count the votes
			if(x == 1 || x == 2 || x == -1){								
				if(x >= 0){
					
					votesTotal++;		
					
					if(x % 2 == 0){
						oratorVotes++;
					}						
					else{
						tichenVotes++;;
					}
				}
			}
			else{
				System.out.println("ERROR!!! Please enter 1 or 2.");
			}
			
		}
		
		//Create object to format decimals 
		DecimalFormat df = new DecimalFormat("##.##");
		
		//Calculate Percentage
		double tichenPerc = (tichenVotes / votesTotal) * 100;
		double oratorPerc = (oratorVotes / votesTotal) * 100;
		
		//Print Results
		System.out.println("Total Number of Votes: " + votesTotal);
		System.out.println("Number of Tichen Votes: " + tichenVotes + " (" + df.format(tichenPerc) + "%)");
		System.out.println("Number of Orator votes: " + oratorVotes + " (" + df.format(oratorPerc) + "%)");
		
		if(tichenVotes == oratorVotes){
			System.out.println("It is a Tie.");
		}
		else if(tichenVotes > oratorVotes){
			System.out.println("Tichen Wins!");
		}
		else{
			System.out.println("Orator Wins!");
		}			
	}
}
