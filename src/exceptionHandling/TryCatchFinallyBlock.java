package exceptionHandling;

public class TryCatchFinallyBlock {

	// individual try or catch cannot be there
	//try - catch
	//try -catch - finally
	//try - finally
	//try - catch1 - catch2 - catch3 - catch n -> can or cannot have a finally

	// can have multiple try-catch in one java file
	// one try can have multiple catch blocks
	// only 1 finally can be used per try

	public static void main(String[] args) {
		System.out.println("Program started......");
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[4]);
		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
		
		
		System.out.println("code after exception occured......");
		System.out.println("-------- 2nd try block-----------"); 



		try {
			String s=null;  
			System.out.println(s.length());
		}catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}

		try {
			String x="abc";  
			int i=Integer.parseInt(x);//Unchecked - NumberFormatException 
		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} 
		
		System.out.println("-----------------------------");
		
		try {
			String x="abc";  
			int i=Integer.parseInt(x);//Unchecked - NumberFormatException 
		}
		finally {
			System.out.println("This is the finally block");
		} 
		
		System.out.println("This is code after finally without a catch");
	}



}
