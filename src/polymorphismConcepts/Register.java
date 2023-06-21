package polymorphismConcepts;

public class Register {

		 String userName;
		 String password;
		 String Confirmpassword;
		
		
		
		// register and login
		// not using method overloading
		
		public void registerUser(String userName, String password, String Confirmpassword) {
			System.out.println(userName + "    "+ password + "    "+ Confirmpassword);
		}
		
		public void loginUser(String userName, String password) {
			System.out.println(userName + "    "+ password);
		}
		
		
		// method overloading by changing the number of arguments
		public void RegisterAndLoginUser(String userName, String password, String Confirmpassword) {
			System.out.println(userName + "    "+ password + "    "+ Confirmpassword);
		}
		
		public void RegisterAndLoginUser(String userName, String password) {
			System.out.println(userName + "    "+ password);
		}
		
		
		// method overloading by changing the data type 
		public void RegisterAndLoginUser(String userName, int password) {
			System.out.println(userName + "    "+ password);
		}
		
		// same method in parent and child class - this is for method overriding
		public void getDetails(String userName,  String password ) {
			System.out.println("This is in parent class  " +  userName + "     " +  password);
		}
		
		
		
	

}

