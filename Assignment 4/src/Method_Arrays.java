import java.util.Arrays;
import java.util.Scanner;

public class Method_Arrays {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		int[] numListArray = new int[10]; //Holds space for 10 numbers 
		
		//Gets a list of 10 user input numbers
		for(int i = 0; i < numListArray.length; i++){		
			System.out.print("Enter number " + i + " out of 10: ");		
			numListArray[i] = input.nextInt();			
		}
		
		//Calls all methods 
		printArray(numListArray);
		range(numListArray);
		reverseArray(numListArray);		
		numEven(numListArray);
		sumEven(numListArray);
		
	}
	
	//Prints the array
	static void printArray(int list[]){
		System.out.println("List of numbers in array");
		System.out.println(Arrays.toString(list));	
	}
	
	//Prints the highest, lowest, and the range
	static void range(int list[]){
			
		int highest = list[0];
		int lowest = list[0];
		
		//gets highest and lowest numbers
	    for (int i = 1; i < list.length; i++) {
	        if (list[i] > highest) {
	            highest = list[i];
	        }
	        else if(list[i] < lowest){
	        	lowest = list[i];
	        }		
	    }
	    
	    //Prints the range
	    int range = highest - lowest;        
	    System.out.println("The highest number is : " + highest);	    
	    System.out.println("The lowest number is : " + lowest);
	    System.out.println("The range is : " + range);	
	}
	
	//Method to reverse the array of 10 integers
	static void reverseArray(int list[]){
		
		//List of 10 hard coded numbers
		int num1 = list[0];
		int num2 = list[1];
		int num3 = list[2];
		int num4 = list[3];
		int num5 = list[4];
		//////////////////////////
		int num6 = list[5];
		int num7 = list[6];
		int num8 = list[7];
		int num9 = list[8];
		int num10 = list[9];
		
		//Prints out the array in reverse order
		System.out.println("Reverse Array");
		System.out.println("[" + num10 + ", " + num9 + ", " + num8 + ", " + num7 + ", " + num6  + 
							", " + num5 + ", " + num4 + ", " + num3 + ", " + num2 + ", " + num1 + "]");		
		
	}
	
	
	static void numEven(int list[]){
		//Count number of even numbers 
		int evenNums = 0;
		for (int i = 0; i < list.length; i++){
			if(list[i] % 2 == 0){
				evenNums++;
			}
		}
		//Prints the even numbers
		System.out.println("Even numbers: " + evenNums);
	    for (int i = 0; i < list.length; i++) {
	        if (list[i] % 2 == 0) {        	
	        	System.out.print(list[i] + " "); 	       	
	        }	
	    }
	    System.out.println();
	}
	//Sums up the even numbers 
	 static void  sumEven(int list[]){	
	
		int sum = 0;
	    for (int i = 0; i < list.length; i++) {
	        if (list[i] % 2 == 0) {	        	
	        	 sum += list[i];   	
	        }	
	    }
	    System.out.println("Sum of the even numbers: " + (sum));
	}
}
