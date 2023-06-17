package basicJavaConcepts;

public class BasicCalculator {

	public static void main(String[] args) {
		
		
		// if we need to call a static method in a diff class
		// need to call it as ClassName.methodsName
		int a = MethodReturnTypes.add(23, 45);
		System.out.println(a);
		
		String name = MethodReturnTypes.fullName("John", "Doe");
		System.out.println(name);
		
		info();
		
		// access non static data in a diff class -> need to create object
		
		MethodReturnTypes  Methods1 = new MethodReturnTypes();
		
		Methods1.div(10, 2);
		Methods1.multi(2, 3);
		
		//multiple objects of the same class but the object name should be different
		
		MethodReturnTypes  Methods2 = new MethodReturnTypes();
		Methods2.div(20, 2);
		Methods2.multi(10, 3);
		
		int x= Methods2.globalvariable;
		System.out.println(x);
		System.out.println(Methods2.globalvariable);
		
		
		System.out.println(Methods2);
		System.out.println(Methods1);

	}
	
	public static void info() {
		System.out.println("This is a method in calculator class");
	}

}
