package basicJavaConcepts;

public class ArraysConcepts {

	public static void main(String[] args) {
		
		
		// Single Dimensional Array
		int[] myNumbers = new int[] {1,2,3,4,5,6,-1,-2,0,93}; // size of array is 10
		
		int[] myNum = {10, 20, 30, 40};
		String[] myString = {"10", "20", "30", "40"};
		boolean[] myBoolean = {true, false, true, false};
		
		// size or length of array
		System.out.println(myNumbers.length);
		
		// access and print specific index value in an array
		System.out.println(myNumbers[5]);
		System.out.println(myNumbers[9]);
		
		// print all numbers in an array
		
		int number = 0;
		for (int i=0; i<myNumbers.length; i++) {
			
			System.out.println(myNumbers[i]);
			
			number = myNumbers[i];
			
			if (number==6) {
				System.out.println("Inside if loop number is " +  number);
			}
			
		}
		
		System.out.println("-----------------------------------------");
		// multidimensional array -> 2D array
		
		int[][] my2DArray = { {1, 2, 3}, {5, 6, 7}, {8,9,4}, {8,9,4} };
		
		
		// rows of array
		System.out.println(my2DArray.length);
		
		// columns of array
		System.out.println(my2DArray[0].length);
		
		for (int i=0; i<my2DArray.length; i++) {
			
			for (int j=0; j<my2DArray[0].length; j++) {
				
				System.out.print(my2DArray[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
