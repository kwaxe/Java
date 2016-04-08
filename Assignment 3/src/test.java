import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int total = 0;
		int counter = 0;
		
		for(int i = 0; i <= num; i++){
			total = total + i;
			//counter ++;
		}
		
		System.out.println(total);
	}
}
