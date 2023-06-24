package exceptionHandling;

public class TestThrows {

	public static void main(String[] args) {

		int age = 24;

		if (age < 18) {

			throw new NumberFormatException("Access denied - You must be at least 18 years old. Current age is " + age);
			//	 throw new NullPointerException("Access denied - You must be at least 18 years old. Current age is " + age);
			//  throw new ArithmeticException("Access denied - You must be at least 18 years old. Current age is " + age);
			//	System.out.println("You are not old enough!  Age is " + age);
		}
		else {
			System.out.println("Access granted - You are old enough!  Age is " + age);

		}
		System.out.println("Continue");

	}

}
