package assignment3;

public class StudentDemo {

	public static void main(String[] args) 
	{
		Functions function = new Functions();
		
		System.out.println("----Student Details Manager----");
		int choice;
		
		function.addStudent();
		function.printStudentDetails();
		function.deleteStudent();
		function.searchStudent();
		function.updateStudent();

	}

}
