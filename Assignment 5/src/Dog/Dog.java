package Dog;

/**
 * @author Kweku Kwabi
 *
 */
public class Dog {

	private String name;
	private int age;
	
	
	//Construct dog object
	public Dog(){
		//System.out.print("What is the dogs name ");
		//name = input.next();
		name = "";
		//System.out.print("How old is the dog ");
		//age = input.nextInt();
		age = 0;
	}
	
	//Constructor initializes two instance variables
	public Dog(String newName, int newAge){
		this.name = newName;
		this.age = newAge;	
	}
	
	//Getter
	public String getName(){
		return name;
	}
	//Getter
	public int getAge(){
		return age;
	}
	
	//Setter for name
	public void setName(String name){
		//name = newName;
		this.name = name;
	}
	//Setter new age
	public void setAge(int age){
		//age = newAge;
		this.age = age;
	}

	
	//Convert dog years to human years
	public int dogAgeInHumanYears(int age){	
		return age * 7;	
	}
	
	//returns desc. of the dog
	@Override
	public String toString(){	
		String message = name + " is [" + age + "] in dog years and [" + dogAgeInHumanYears(age) + "] in human years.";					
		return message;
	}
}

