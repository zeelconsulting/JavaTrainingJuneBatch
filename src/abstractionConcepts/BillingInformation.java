package abstractionConcepts;

				// child class  		parent abstract class
public class BillingInformation extends AddProductToCart {
	
	
	// method of child class
	public String paymentType (String type) {

		System.out.println("Payment type entered is  " + type);
		return type;		
	}

	// method of child class
	public void cardNumber (String number) {
		System.out.println("card number entered is  " + number);

	}

	// method of child class
	public void cardHolderName (String fname, String lname) {
		System.out.println("Name entered is  " + fname + " " + lname);		
	}
	

	// implementation of abstract methods is done in the class which inherits it
	@Override
	public void productCategory() {
		System.out.println("product category is Grocery");
	}


	@Override
	public void quantityInStock() {
		System.out.println("product quantity is 100");

	}


	@Override
	public void productUnit() {
		System.out.println("product unit is boxes");
		// TODO Auto-generated method stub

	}




}
