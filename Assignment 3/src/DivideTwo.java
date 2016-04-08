import java.util.Scanner;

public class DivideTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0; 
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		while(num > 1){			
			num = num / 2;
			System.out.println((double)num);
			counter++;
		}
		System.out.println(num + " can be divided by two " + counter + " times");
	}

}
