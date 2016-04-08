package Student;



public class Student {
	
	private String firstName;
	private String lastName;
	private double test1Grade;
	private double test2Grade;
	private double test3Grade;
	
	
	
	public Student(String firstName, String lastName){
		
		firstName = this.firstName;
		lastName = this.lastName;
		
		test1Grade = 0;
		test2Grade = 0;
		test3Grade = 0;	
	}
	
	
	
	public void setTestScore(int testNum, int score){
		
		if (testNum == 1){
			test1Grade = score;
		}
		else if(testNum == 2){
			test2Grade = score;
		}
		else if(testNum == 3){
			test3Grade = score;
		}
	}
	
	public double getTestScore(int testNum){	
		
		if (testNum == 1){
			return  test1Grade;
		}
		else if(testNum == 2){
			return test2Grade;
		}
		else if(testNum == 3){
			return test3Grade;
		}
		return testNum;
				
	}
	
	public double average(){
		double total = test1Grade + test2Grade + test3Grade;
		return total / 3;
	}
	
	public String toString(){	
		String message = "Name: " + firstName + " " + lastName + "\n" +
							"Test Score 1: " + test1Grade + "\n" +
							"Test Score 2: " + test2Grade + "\n" +
							"Test Score 3: " + test3Grade + "\n" +
							"Average: " + average();
		
		return message;
	}
	
	
	

}
