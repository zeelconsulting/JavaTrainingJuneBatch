package basicJavaConcepts;

public class ConditionalStatements {

	public static void main(String[] args) {

		// if else  and switch

		int marks = 45;

		if (marks > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}


		String day = "Wednesday";

		if (day.equals("Monday")) {
			System.out.println("First day of the week");
		}
		else if (day.equals("Tuesday")) {
			System.out.println("Second day of the week");
		}
		else if (day.equals("Wednesday")) {
			System.out.println("Third day of the week");
		}
		else {
			System.out.println("Invalid day");
		}	



		System.out.println(selectEnv("DEV"));
		System.out.println(selectEnv("UAT"));
		System.out.println(selectEnv("PROD"));
		System.out.println(selectEnv("Regression"));

	}



	public static String selectEnv(String env) {

		String url = null;

		switch(env){
		case "DEV":
			//System.out.println("www.testdev.com");
			url = "www.testdev.com";
			break;
		case "UAT":
			//	System.out.println("www.testuat.com");
			url = "www.testuat.com";
			break;
		case "PROD":
			//	System.out.println("www.testprod.com");
			url = "www.testprod.com";
			break;

		default:
			System.out.println("use the correct Env");	
		}

		return url;

	}

}
