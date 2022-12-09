package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	
		
		//Declare Linked List
		//LinkedList  ll = new  LinkedList();
	    //LinkedList  <Integer> ll  = new  LinkedList  <Integer> ();
		//LinkedList  <String> ll  = new  LinkedList  <String> ();
		
		LinkedList  ll  = new  LinkedList();
		
		//Add elements to linked  list
		ll.add(100);
		ll.add("Welcome");
		ll.add(15.5);
		ll.add('A');
		ll.add(true);
		ll.add(null);
		System.out.println(ll);        /////          [100, Welcome, 15.5, A, true]
		
		System.out.println(ll.size());                    ///5
		
		ll.remove(2);
		System.out.println("Afyter removing new list :"   +  ll);         ////  [100, Welcome, A, true, null]
		
		ll.remove(true);
		System.out.println("Afyter removing new list :"   +  ll);             ////  [100, Welcome, A, null]
		
		
		ll.add(3, "Saranya");
		System.out.println("After   inserting  the  object :"  +  ll);           ////  :[100, Welcome, A, Saranya, null]
		
		////Retrinving the obect
		System.out.println("After   retriving  the  element :"  +ll.get(2));         /// A
		
		///Replace   value
		System.out.println("After   changimg  the  value  :"  + ll.set(4, "Java"));           /// [100, Welcome, A, Saranya, Java]
		
		
		// Fetch  value
		System.out.println("Fetching   value  :"  + ll.contains("Java"));          //true
		System.out.println("Fetching   value  :"  + ll.contains("papa"));     //false
		
		System.out.println("Check the empty or  not  :"  + ll.isEmpty());          // false
		
		
		//Read objects from Linkedlist    for  loop
		/*for(int   i  =0;   i<ll.size();   i++)
		{
			System.out.println(ll.get(i));
		}*/
		
		
		/*for( Object   x  :  ll)
		{
			System.out.println(x);
		}*/
		
		
		//iterator
		Iterator   it  =  ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
