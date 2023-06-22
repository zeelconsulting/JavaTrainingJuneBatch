package abstractionConcepts;

public class Testing extends AddProductToCart{







	// implementation of abstract methods is done in the class which inherits it
	@Override
	public void productCategory() {
		System.out.println("product category is Grocery and household");
	}


	@Override
	public void quantityInStock() {
		System.out.println("product quantity is 10000");

	}


	@Override
	public void productUnit() {
		System.out.println("product unit is litres");
		// TODO Auto-generated method stub

	}




}


