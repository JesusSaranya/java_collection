package collectionsDemo;
import  java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
	
		//HashSet  hs  = new HashSet();              // default capacity is  16======deafault load factor  in 0.75
		
		//HashSet   ha  =  new  HashSet(100);       ///initial capacity  100
		
		//HashSet   ha  =  new  HashSet(100  ,  (float) 0.75);       ///initial capacity  100
		
		HashSet  hs  = new HashSet ();
		
		// Add objects into HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add('A');
		hs.add(true);
		hs.add("Tiger");
		hs.add(16.4);
		
		System.out.println(hs);           /// Insertion order not allowed   //  [A, 100, 16.4, Welcome, Tiger, true]
		
		 // remove
		hs.remove(16.4);
		System.out.println("After  removing  the  value :"   + hs);        ////   :[A, 100, Welcome, Tiger, true]
		
		//contains
		//hs.contains("Welcome");
		System.out.println("Checking  the  element is present  or not :"  + hs.contains("Welcome"));       /// true
		System.out.println(hs.contains("Lion"));                // false
		
		// empty
		System.out.println(hs.isEmpty());               //false
		
		
		//to read  elemnts   or  objects from HashSet
		for(Object  x : hs)
		{
			System.out.println(x);
		}
		
		//iterator() to read elements
		Iterator  it  =hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
