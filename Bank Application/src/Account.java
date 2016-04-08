/**
 * 
 */

/**
 * @author KWKW001
 *
 */
public class Account {

	private int accountType; //1 = savings , 2 = checking
	private double balance;
	
	public Account(int accountType) {
		this.accountType = accountType;
		this.balance = 0;
	}

	public Account(int accountType, double balance) {
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void credit(double value){	
		this.balance = balance + value;
	}
	
	public void debit(double value){
		this.balance = balance - value;
	}
	
	public void addInterest(double value){
		double interest = balance * value;	
		this.balance = balance + interest;	
	}
	
	public String toString(){
		String message = "";
		message += "Account Type: " + getAccountType() + "\n";
		message += "Balance: $" + getBalance();
		
		return message;
	}

}
