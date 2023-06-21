package polymorphismConcepts;

// public class  childClassName extends ParentClassName
public class HomepageChild extends Register{
	
	
	 String productName;
	 int quantity;
	

	// same method in parent and child class - this is for method overriding
	
	public void getDetails(String userName,  String password ) {
		System.out.println("This is in child class  " +  userName + "     " +  password);
	}
	
}
