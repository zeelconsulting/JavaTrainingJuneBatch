package basicJavaConcepts;

public class MethodReturnTypes {
	
	int globalvariable = 10;


	public static void main(String[] args) {
		
		// static methods -  we need to declare methods as static and then call them in the main method
		// non static methods - need to create an object of the class and then call them in the main method
		// if we need to call a non static method into a static main method - need to call it using a object of the class.
		
		int a = add(4, 5);
		System.out.println(a);
		 a = add(4,23);
		System.out.println(a);
		 a = add(4,56);
		System.out.println(a);
		
		
		// creating object of a class 
		// className   objectName = new className();
		MethodReturnTypes  Methods = new MethodReturnTypes();
		
		
	//	call a non static variable or method
		// objectName.methodname  or // objectName.variableName
		Methods.div(10, 2);
		Methods.multi(2, 3);
		
		
		String name = fullName("John", "Doe");
		System.out.println(name);
		
		Methods.sub(10, 2);
		
		noReturnNoArgs();
		
		String stm = Methods.withReturnNoArgs();
		System.out.println(stm);
		System.out.println(Methods.withReturnNoArgs());
		
	

	}

	
	/*
	Author - Himanshu
	date created = 06/17/2023
	These methods are created for basic calculator calculations
	Methods can be 2 types - return a value or does not return a value
	Methods  can have parameters or can be without parameters
	*/

	// having a return type as int and having 2 parameters
	public static int add (int a , int b) {
		int sum = a+b;
		return sum;
	}

	// having a return type as String
	public static String fullName (String firstName , String lastName) {
		String name = firstName + " " + lastName;
		return name;
	}

	public void sub (int a , int b) {
		int diff = a-b;
		System.out.println(diff);
	}

	public int multi (int a , int b) {
		int product = a*b;
		System.out.println(product);
		return product;
	}


	public int div (int a , int b) {
		int quotient = a/b;
		System.out.println(quotient);
		return quotient;
	}
	
	

	// this method does not return any value and does not have parameters
	public static void noReturnNoArgs() {
		System.out.println("This is a method with no arguments and no return type");

	}

	public String withReturnNoArgs() {
		String stm = "This is a method with no arguments and with return type";
		return stm;

	}
	
	void noReturnNoArgs1() {
		System.out.println("This is a method with no arguments and no return type");

	}

}
