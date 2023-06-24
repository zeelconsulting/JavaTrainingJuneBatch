package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5]; 
		try{    

			//a[5]=30/0;   
			//System.out.println(a[7]);

			String s=null;  
			System.out.println(s.length());
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs  "  + e); 
			a[4]=30/5;
			System.out.println(a[4]);
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs  "  + e);  
		}    
		catch(NullPointerException e)  
		{  
			System.out.println("Null Pointer Exception occurs  " + e);  
			System.out.println("String is null. please use a valid input");
		}
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs  " + e);  
		}             
		System.out.println("code after exception occured......");  
		System.out.println(); 

	}

}
