package automation_pooja;

public class CallingAbstractClass {

	
	
	public static void main(String[] args)
	{
	childAbstractClass objChild=new childAbstractClass();
	
	//Calling functions of abstract class
	objChild.ProductName("Milk");
	objChild.productQuantity();
	objChild.productUnit();
	objChild.ProductCategory();
	
	//calling child functions
	objChild.paymentType("Online");
	
	
	
	}
	
}
