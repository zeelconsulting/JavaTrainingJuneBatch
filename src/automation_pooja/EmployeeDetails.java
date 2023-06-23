package automation_pooja;

public class EmployeeDetails {
	String Fname;
	String Lname;
	int Age;
	String DOB;
	String Gender;
	String BankDetails;

//Calling a constructor by creating an object of that class
	//Constructor overloading 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp=new EmployeeDetails("Pooja","Sharma",39,"25/03/1984","Female","BMO-234456667");
		EmployeeDetails employee = new EmployeeDetails("Aahil", "Sharma1", 7);

	}

	public EmployeeDetails(String Fname, String Lname, int Age1, String DOB, String Gender, String BankDetails) {
		this.Fname = Fname;
		this.Lname = Lname;
		Age = Age1;
		this.DOB = DOB;
		this.Gender = Gender;
		this.BankDetails = BankDetails;
		System.out.println("Name of Employee is " + Fname + " " + Lname);
		System.out.println("Age is " + Age1);
		System.out.println("DOB is " + DOB);
		System.out.println("Gender " + Gender);
		System.out.println("BankDetails " + BankDetails);
		System.out.println("----------------------------------------");

	}
	public EmployeeDetails(String Fname, String Lname, int Age1) {
		this.Fname = Fname;
		this.Lname = Lname;
		Age = Age1;
		System.out.println("Name of Employee is " + Fname + " " + Lname);
		System.out.println("Age is " + Age1);
		System.out.println("----------------------------------------");

	}
	
	

}
