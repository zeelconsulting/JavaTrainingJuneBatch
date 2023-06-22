package collectionsConcepts;

import java.util.*;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//arrayList of Integer
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		
		// Arraylist of Strings
		ArrayList<String> stringArrayList = new ArrayList<String>();
		
		// add data to an arrayList
		stringArrayList.add("One"); //0
		stringArrayList.add("Two"); //1
		stringArrayList.add("Three");//2
		stringArrayList.add("One");
		stringArrayList.add("Two");
		stringArrayList.add("Three");
		stringArrayList.add("One");
		stringArrayList.add("Two");
		stringArrayList.add("Three");
		stringArrayList.add("Six");
		stringArrayList.add("Six");
		
		
		System.out.println(stringArrayList);
		
		// capacity of a list
		System.out.println(stringArrayList.size());
		
		// retrieve an element
		System.out.println(stringArrayList.get(2));
		
		//addition
		stringArrayList.add(3, "Four");
		System.out.println("After adding " + stringArrayList.size());
		System.out.println(stringArrayList);
		
		// removing 
		stringArrayList.remove(3);
		System.out.println("After removing " + stringArrayList.size());
		System.out.println(stringArrayList);
		
		//sort
		Collections.sort(stringArrayList);
		System.out.println("Sorted list " + stringArrayList);
		
		Collections.reverse(stringArrayList);
		System.out.println("Sorted list in reverse " + stringArrayList);
		
		
		for (int i=0;i<stringArrayList.size(); i++ ) {
			System.out.println(stringArrayList.get(i));		
		}
		
		// checking for an element in an arraylist
		System.out.println(stringArrayList.indexOf("Three"));
		System.out.println(stringArrayList.indexOf("Four")); // for data not present in list, index will come as -1
		
		//last indexOf
		System.out.println(stringArrayList.lastIndexOf("Three"));
		
		// to get frequency
		System.out.println(Collections.frequency(stringArrayList, "One"));
		
		//getting a sublist
		List<String> stringArrayListSub = new ArrayList<String>();
		stringArrayListSub = stringArrayList.subList(2, 7);
		
	//	stringArrayList.subList(stringArrayList.indexOf("Three"), stringArrayList.indexOf("Four")+1);
		
		System.out.println(stringArrayList);
		System.out.println("sublist is " + stringArrayListSub);
		System.out.println(stringArrayListSub.size());
		stringArrayListSub.remove(2);
		System.out.println(stringArrayListSub.size());
		System.out.println(stringArrayListSub);
		
		
		
		
		
	}

}
