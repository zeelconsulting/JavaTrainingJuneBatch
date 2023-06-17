package basicJavaConcepts;

public class StudentDetails {
	
	// global variables
	String fName;
	String lName;
	int rollNum;
	boolean learningJava;
	char batchName;
	
	// default constructor without params
	public StudentDetails() {
		batchName = 'A';
		System.out.println("This is a default constructor");
	}
	
	
	// constructor with 1 param
	// this keyword
	public StudentDetails(boolean learningJava ) { // local variable
		// global variable =  localvariable
		this.learningJava = learningJava;
		System.out.println("This is a constructor with 1 param");
	}
	
	
	// constructor with 3 param - constructor overloading
	public StudentDetails(String fName, String lName, int rollNum1) {
		this.fName = fName;
		this.lName = lName;
		rollNum = rollNum1;
		batchName = 'A';
		learningJava = true;
		System.out.println("This is a constructor with 3 param");
		
	}
	
	// constructor with 5 param - constructor overloading
	public StudentDetails(String fName, String lName, int rollNum1,char batchName, boolean learningJava) {
		this.fName = fName;
		this.lName = lName;
		rollNum = rollNum1;
		this.batchName = batchName;
		this.learningJava = learningJava;
		
	}
	
	public void studentInfo() {
		
		// local variable
		int localvariable = 5;
		System.out.println("Name of student is " + fName + " " + lName);
		System.out.println("Rollnum is " + rollNum);
		System.out.println("BatchName is " + batchName);
		System.out.println("Learning Java " + learningJava);
		System.out.println("local variable value is " + localvariable);
		System.out.println("----------------------------------------");
	}
	

}
