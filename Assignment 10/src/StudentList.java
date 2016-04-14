
public class StudentList {
	
	private int numOfStudents;
	private Student studentList[];
	
	public StudentList(int maxNumOfStudents){
		this.numOfStudents = 0;
		this.studentList = new Student[maxNumOfStudents];
	}
	
	public void addStudent(int id, String name, int age, int gpa){
		
		Student s = new Student(id, name, age, gpa);
		studentList[this.numOfStudents] = s;
		numOfStudents++;
		
	}
	
	public Student findStudent(int id){
		
		Student s = null;
		
		for(int i = 0; i < studentList.length; i++){
			if(studentList[i].getId() == id){
				s = studentList[i];
			}
		}
		
		return s;
		
	}

}
