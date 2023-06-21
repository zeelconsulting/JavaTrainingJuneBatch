package basicJavaConcepts;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		// for loop
		
		// i++ ->  i = i+1
		// initialization; condition; increment
		for (int i =1; i<2; i++) {
			//System.out.println("The number is " + i);
			number(i);	
		}
		
	// if not using for loop - need to run the method multiple times - code length is increased and not maintainable	
//		number(0);
//		number(1);
//		number(2);
//		number(3);
//		number(4);
		
		System.out.println("--------------------------------------");
		
		//while loop
		int x = 0; // initialization
		while (x< 3) { // condition
			number(x);
			x++; // increment
		}
		
		System.out.println("--------------------------------------");
		
		// do-while
		
		int j =0; // initialization
		do {
			number(j);
			j++; // increment
		}
		while (j<0); // condition
		

	}
	
	public static void number(int i) {
		System.out.println("The number is " + i);
		
	}
	
	
	

}
