package automation_pooja;
import java.util.*;


public class Collections {
	
	public static void main(String[] args) {
		int n=0;
		//Array 
		int[]number=new int[] {1,2,3,4,5,6,7,8,10};
		for(int i=0;i<9;i++)
		{
		 n=number[i];
		System.out.println(number[i]);
		
		}
		System.out.println(n);
			
		//	Array List
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int j=0;j<10;j++)
		{
		arrayList.add(j);
		}
		System.out.println(arrayList);
		
		
		ArrayList<String> SarrayList=new ArrayList<String>();
		SarrayList.add("Pooja");
		SarrayList.add("Aahil");
		SarrayList.add("Ashu");
		SarrayList.add("Mummy");
		SarrayList.add("Papa");
		System.out.println(SarrayList);
		
		
		//HashMap
		HashMap<Integer,String> hamp=new HashMap<Integer,String>();
		hamp.put(1,"sfdf");
		hamp.put(2,"sfdf");
		hamp.put(3,"sfdf");
		for (Map.Entry m: hamp.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		
		}
		
		
		//LinkedList
		LinkedList<String> stLinked=new LinkedList<String>();
		stLinked.add("Aahul");
		stLinked.add("Raj");
		stLinked.add("Baman");
		stLinked.add("Ranju");
		stLinked.add("CajKumar");
		System.out.println(stLinked.size());
		stLinked.sort(null);
		System.out.println("Sorted list " + stLinked);
		
		
		
	}

}
