package interfaceConcepts;

public interface BillingInfo extends AddToCart{
	
	public String paymentType (String type);

	public void cardNumber (String number);

	public void cardHolderName (String fname, String lname);
	
	public void CVV(int cvv);
	
	public void expirydate(String month, String year);
	
	// interface extends interface
	//class extends class
	// class implements interface...n
	// class extends class implements interface...n  -> Multiple Inheritance

	// interface1 (5), interface2 (3)
	//	interface1 extends interface2;

	//public class1 implements interface1 -> 8 methods should be implemented
	//public class1 implements interface2 -> 3 methods should be implemented
	// public class1 implements interface1, interface2

}
