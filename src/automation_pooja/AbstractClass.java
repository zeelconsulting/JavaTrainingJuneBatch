package automation_pooja;
//Parent class can be access by child class
public abstract class AbstractClass {

	//abstract class is a class that is used to hiding the details from the real world
	//abstraction class is used with abstract keyword and no definition of the abstract function
	//Non abstract function can also be the part of abstract class and we can access the abstract function 
	//by creating an object of child class and definition of abstract function is in the child class.
	
	public abstract void ProductCategory();
	public void ProductName(String productName)
	{
		System.out.println(productName);
	}
	public abstract void productQuantity();
	
	public abstract void productUnit();
	
	
	
	
}
