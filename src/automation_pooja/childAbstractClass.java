package automation_pooja;
public class childAbstractClass extends AbstractClass {
	
	
	//child method
	public String paymentType(String type)
	{
		System.out.println("Payment type entered is  " + type);
		return type;	
	}
	
	
	//Definition of abstract method
	//If we dnt call any abstract method it will prompt an error
	@Override
	public void ProductCategory()
	{
		System.out.println("product category is Grocery");
	}
	@Override
	public void productQuantity()
	{
		System.out.println("productQuantity");
	}
	@Override
	public void productUnit()
	{
		System.out.println("product is in unit 2");
	}
	
	

}
