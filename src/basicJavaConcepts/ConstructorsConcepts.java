package basicJavaConcepts;

public class ConstructorsConcepts {
	
	
	public static void main(String[] args) {
		
		StudentDetails  sd1 = new StudentDetails();
		sd1.studentInfo();
		
	//	System.out.println(sd1.batchName);
		StudentDetails  sd2 = new StudentDetails(true);
		sd2.studentInfo();
		
		
		StudentDetails  sd3 = new StudentDetails("John" , "Doe", 123);
		sd3.studentInfo();
		
		
		StudentDetails  sd4 = new StudentDetails("John1" , "Doe1", 1234, 'B', false);
		sd4.studentInfo();
		
	}

}
