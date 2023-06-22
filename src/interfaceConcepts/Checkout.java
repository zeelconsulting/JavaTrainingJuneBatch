package interfaceConcepts;


public class Checkout implements AddToCart, BillingInfo  {

	public static void main(String[] args) {
		
		Checkout check = new Checkout();
		
		check.productCategory();
		check.productName("Eggs");
		check.priceOfProduct(3.79);
		check.quantityInStock();
		check.quantity(10);
		check.productUnit();
		
		
		// billing information
		check.paymentType ("Credit card");
		check.cardNumber("123456789123456");
		check.cardHolderName ("John", "Doe");
		check.CVV (123);
		check.expirydate ("04", "2026");
		

	}

	public void productName(String productName) {
		System.out.println("Product entered is " + productName );
	}
	
	public double priceOfProduct(double price) {
		System.out.println("price of product is  " + price);
		return price;
	}
	
	
	public int quantity(int quantity) {
		System.out.println("quantity of product is  " + quantity);
		return quantity;
	}
	
	public String paymentType (String type) {

		System.out.println("Payment type entered is  " + type);
		return type;		
	}


	public void cardNumber (String number) {
		System.out.println("card number entered is  " + number);

	}

	public void cardHolderName (String fname, String lname) {
		System.out.println("Name entered is  " + fname + " " + lname);		
	}

	@Override
	public void CVV(int cvv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expirydate(String month, String year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void productCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quantityInStock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void productUnit() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
