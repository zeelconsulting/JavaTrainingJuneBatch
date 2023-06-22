package collectionsConcepts;
import java.util.*;

public class HashMapConcepts {

	public static void main(String[] args) {
		
		HashMap<Integer,String> al=new HashMap<Integer,String>();

		al.put(1,"Honda");
		al.put(2,"Toyota");
		al.put(3,"Hyundai");
		al.put(4,"BMW");
		al.put(5,"Mercedes");
		al.put(6,"Acura");
		al.put(7,"Audi");
		
		
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.get(7));
		
		al.put(2,"Tesla");
		System.out.println(al.get(2));
		
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
