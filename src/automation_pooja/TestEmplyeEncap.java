package automation_pooja;


public class TestEmplyeEncap {

	public static void main(String[] args) {
		
		
		//By creating an object we have used getter and setter function
		//we cannot access the private variables outside the class
		
		EmplyeeEncap empencap=new EmplyeeEncap();
		empencap.setEFirstName("Pooja");
		empencap.setELastName("Sharma");
		empencap.setEDOB("25/03/1984");
		empencap.setEAge(38);
		empencap.setENo(45);
		
		
		System.out.println(empencap.getEFirstName());
		System.out.println(empencap.getELastName());
		System.out.println(empencap.getEDOB());
		System.out.println(empencap.getEAge());
		System.out.println(empencap.getENo());
			

	}

}
