package automation_pooja;

public class CallingClassInterface implements InterfaceAdToCart,SecondInterface {
	
	public static void main(String[] args) {

	//create object of class
	CallingClassInterface objClassInter=new CallingClassInterface();
	objClassInter.CVV(34);
	objClassInter.cardHolderName("Pooja","Sharma");
	objClassInter.cardNumber("12323243");
	objClassInter.paymentType("drer");
	objClassInter.expirydate("23/2/2022","ewewewe");
	
	//functions of InterfaceAdToCart is calling with class object
//	objClassInter.priceOfProduct(333.56);
	objClassInter.productName("Milk");
	
	
	
	
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
