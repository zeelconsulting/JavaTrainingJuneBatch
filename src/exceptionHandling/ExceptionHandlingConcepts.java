package exceptionHandling;

public class ExceptionHandlingConcepts {

	public static void main(String[] args) {
		
		
		/*
		 * If we don't use exception Handling
		 * 
		System.out.println("Before Try block");
		
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[4]); // ArrayIndexOutOfBoundsException
		System.out.println("code after exception occured in try block......");
		System.out.println(); 
		
		System.out.println("After try catch block");
		
		*/
		
		
		// after using exception Handling
		
		System.out.println("Before Try block");
		try {
			System.out.println("Program started......");
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[4]); // ArrayIndexOutOfBoundsException
			System.out.println("code after exception occured in try block......");
			System.out.println(); 
			
		}
		catch (Exception e){
			System.out.println("code after exception occured......");
			System.out.println(e);
			System.out.println("Code inside catch block");	
		}
		
		System.out.println("After try catch block");
		
		System.out.println("-------------------------------------------");
		
		
		
		
		/*
		
		try {
		System.out.println("Program started......");
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[4]); // ArrayIndexOutOfBoundsException
		System.out.println("code after exception occured in try block......");
		System.out.println(); 
		}
		catch(Exception e) {
			System.out.println("code after exception occured......");
			System.out.println(e);
			System.out.println("Code inside catch block");
			e.printStackTrace();
		}
		
		
		*/
		


	}

}
