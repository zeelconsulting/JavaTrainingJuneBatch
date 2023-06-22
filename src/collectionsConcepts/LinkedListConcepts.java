package collectionsConcepts;
import java.util.*;

public class LinkedListConcepts {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>(); 
		
		al.add("Honda");
		al.add("Toyota");
		al.add("Hyundai");
		al.add("BMW");
		al.add("Mercedes");
		al.add("Acura");
		al.add("Porsche");
		
		
		//size of a list
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(0, "Tesla");
		System.out.println(al);
		
		al.addFirst("Audi");
		System.out.println(al);
		
		al.addLast("Kia");
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		
		System.out.println(al.contains("BMW"));
		System.out.println(al.contains("Tesla"));
		System.out.println(al.indexOf("Acura"));
		System.out.println(al.indexOf("Kia"));
		
		System.out.println(Collections.frequency(al, "BMW"));
		Collections.sort(al);
		System.out.println("Sorted list " + al);
		
		Collections.reverse(al);
		System.out.println("Sorted list " + al);
		
		
		
		
		
	

	}

}
