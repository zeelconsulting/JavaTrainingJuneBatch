package collectionsConcepts;
import java.util.*;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		// declare a hash map
		HashMap<Integer,String> al=new HashMap<Integer,String>();
		HashMap<String,String> al1=new HashMap<String,String>();
		
		// add values to a hash map
		al1.put("1", "Java");
		al1.put("2", "Python");
		al1.put("3", "C++");

		al.put(1,"Honda");
		al.put(2,"Toyota");
		al.put(3,"Hyundai");
		al.put(4,"BMW");
		al.put(5,"Mercedes");
		al.put(6,"Acura");
		al.put(7,"Audi");
		
		
		System.out.println(al.size());
		
		// get the value based on Key
		System.out.println(al.get(2));
		System.out.println(al.get(7));
		
		// null is printed if the Key is not present
		System.out.println(al.get(8));
		
		// add the data in a Map using the key and it will replace the value if the key already exists
		al.put(2,"Tesla");
		al.put(8,"Tesla123");
		System.out.println(al.get(2));
		System.out.println(al.get(8));
		
		for (Map.Entry m: al.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
	//	al.remove(4);
	//	al.remove(6, "Acura");
	//	System.out.println(al.size());
		
		al.putIfAbsent(8, "Tesla");
		System.out.println(al.size());
		
		for (Map.Entry m: al.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}

		
		al.putIfAbsent(8, "Tesla");
		System.out.println(al.size());
		
		System.out.println(al);
		
	}

}
