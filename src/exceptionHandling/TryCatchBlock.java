package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("Program started......");
		try {
			int data=100/0; // Unchecked - Arithmetic exception

			String s=null;  
			System.out.println(s.length());//Unchecked - NullPointerException  

			String x="abc";  
			int i=Integer.parseInt(x);//Unchecked - NumberFormatException 


		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		}
		System.out.println("code after exception occured......");
		System.out.println(); 

	}

}
