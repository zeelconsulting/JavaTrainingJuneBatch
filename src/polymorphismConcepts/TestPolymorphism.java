package polymorphismConcepts;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		
		Register register = new Register();
		
		// without using overloading
		register.registerUser("Testing", "Test@1234", "Test@1234");
		register.loginUser("Testing", "Test@1234");
		
		
		// using overloading
		register.RegisterAndLoginUser("Testing", "Test@1234", "Test@1234"); // 3 parameters, same data types of arguments
		register.RegisterAndLoginUser("Testing", "Test@1234"); // 2 parameters, same data types of arguments - both String
		register.RegisterAndLoginUser("Testing", 123456); // 2 parameters, different data types of arguments - one string; one int
		
		
		
		register.getDetails("Testing", "Test@1234");
		
		HomepageChild home = new HomepageChild();
		
		// method overriding
		home.getDetails("Testing", "Test@1234");
		
	
	}

}
