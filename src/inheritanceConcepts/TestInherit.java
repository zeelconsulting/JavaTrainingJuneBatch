package inheritanceConcepts;

public class TestInherit {

	public static void main(String[] args) {
		
		
		RegisterParent register = new RegisterParent();
		
		register.setPassword("Test123");
		register.setUserName("Testing");
		register.setConfirmpassword("Test123");
		
		// TC1 - register a user
		System.out.println(register.getUserName());
		System.out.println(register.getPassword());
		System.out.println(register.getConfirmpassword());
		
		
		
		//TC2 - register and select a product - write methods for register again; reuse methods written for register page
		
	//	register - parent class
	//	Homepage - child class
		
		// Single Inheritance
		HomepageChild  home = new HomepageChild();
		
		home.setProductName("milk");
		home.setQuantity(2);
		home.setPassword("Test123");
		home.setUserName("Testing");
		home.setConfirmpassword("Test123");
		
		
		System.out.println(home.getUserName());
		System.out.println(home.getPassword());
		System.out.println(home.getConfirmpassword());
		System.out.println(home.getProductName());
		System.out.println(home.getQuantity());
		
		
		System.out.println("-------------------------------------------");
		// Multilevel Inheritance
			//TC3 - checkout	E2E flow =  Register -> Add product (HomepageChild)-> checkout	
	//	Register -> parent / super class
	//	Home -> child / subclass
	//	Checkout -> grandchild
		
		CheckOut check = new CheckOut();
		
		check.setProductName("milk");
		check.setQuantity(2);
		check.setPassword("Test123");
		check.setUserName("Testing");
		check.setConfirmpassword("Test123");
		check.setCardNumber("1234567890");
		check.setName("JOHN DOE");
		
		System.out.println(check.getUserName());
		System.out.println(check.getPassword());
		System.out.println(check.getConfirmpassword());
		System.out.println(check.getProductName());
		System.out.println(check.getQuantity());
		System.out.println(check.getCardNumber());
		System.out.println(check.getName());
		
		System.out.println("-------------------------------------------");
		
		
		// Heirarchial -  if 2 classes extends the same class
		// Login extends RegisterParent
		// Homepagechild extends  RegsiterParent
		

	}

}
