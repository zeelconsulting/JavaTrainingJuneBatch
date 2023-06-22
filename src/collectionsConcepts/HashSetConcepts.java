package collectionsConcepts;
import java.util.*;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> al=new HashSet<String>();  
		
		al.add("Honda");
		al.add("Toyota");
		al.add("Hyundai");
		al.add("BMW");
		al.add("Mercedes");
		al.add("Acura");
		al.add("Porsche");

		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("BMW");
		al.add("Mercedes");
		al.add("Acura");
		al.add("Porsche");
		al.add("porsche");
		
		System.out.println(al.contains("Acura"));
		System.out.println(al.contains("Tesla"));
		
		System.out.println("---- after adding duplicates-----");
		System.out.println(al.size());
		System.out.println(al);
		
		//get index of elements in Set -> convert it to a Arraylist or linkedlist
		ArrayList<String> list = new ArrayList<>(al);
		LinkedList<String> Linklist = new LinkedList<>(al);
		System.out.println(list);
		
		for (int i=0;i<list.size(); i++ ) {
			System.out.println(list.get(i));		
		}
		
		System.out.println("--------------------------------");
		//for -each
		for(String i:al) {
			System.out.println(i);
		}
		
		
	}

}
