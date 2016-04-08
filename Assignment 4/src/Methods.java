import java.util.Scanner;

public class Methods {
	
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Asks for user input 
		System.out.print("Enter a number: ");
		int inputNumber = input.nextInt();
		
		//Calling printSequence method using the inputNumber
		int printSeqRes = printSequence(inputNumber);
		
		int triNum = triangularNum(inputNumber);
		int fac = factorial(inputNumber);
		
		//Prints space
		System.out.println();
		
		//Calling the triangularNum method using the inputNumber
		System.out.println("The triangular number is: " + triNum);
		//triangularNum(inputNumber);
		
		//Calling the factorial method using the inputNumber
		System.out.println("The factorial number is: " + fac);
		//factorial(inputNumber);
		
	}
	
	//Create printSequence method that takes one int variable
	static int printSequence(int num){
		
		int res = 0;
		
		if(num > 0){			
			for (int i = 1; i <= num; i++){
				System.out.print(i + " ");
			}			
		}
		else{
			for (int i = -1; i >= num; i--){
				System.out.print(i + " ");
			}
		}		
		return res;
	}
	
	//Create triangularNum method
	static int triangularNum(int num){
			
		int total = 0;
				
		if(num > 0){
			for(int i = 0; i <= num; i++){
				total = total + i;
			}
		}		
		return total;
	}
	
	//Create factorial method 
	static int factorial(int num){
		
		int fac = 1;
		if(num > 0){
			for(int i = 1; i <= num; i++){					
				fac *= i;		
			}
		}
		return fac;
	}	
}
