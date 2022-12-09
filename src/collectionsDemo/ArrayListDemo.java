package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	
	   ///DECLARE  ARRAYLIST=======
	   // ArrayList  al = new ArrayList();
	    //ArrayList <Integer>  al = new ArrayList <Integer>();
	   //ArrayList  <String> al = new ArrayList <String>();
	  // List  al = new ArrayList();

	public static void main(String[] args) {
		
		ArrayList  al  = new  ArrayList();
		 //Add new elemnte to the ArrayList======
		
		al.add(100);
		al.add("Welcome");
		al.add(15.6);
		al.add('A');
		al.add(true);
		
		System.out.println(al);         ///[100, Welcome, 15.6, A, true]
		
		//Size===========
		System.out.println("Number  of elemnets in  array list  :"  + al.size());      //5
		
		///Remove====
		al.remove(1);
		System.out.println("After removing from arrylist  : "  + al);      //  [100, 15.6, A, true]
		//al.remove("true");
		
		//Insert New Element
		//add(index,  object)
		al.add(2,"Python");
		System.out.println("After adding new element :"  +  al);     ///[100, 15.6, Python, A, true]
		
		//Retrive specific element
		System.out.println("After retrive the element :"  + al.get(3));       //A    is index of element
		
		//Change the exsisting value
		al.set(2, "Saranya");
		System.out.println("After replacing the element :"  + al);           ////[100, 15.6, Saranya, A, true]
		
		
		///search - contains()====Return True or false
		System.out.println(al.contains("Saranya"));         //True
		
		//isEmpty()
		System.out.println(al.isEmpty());
		
		///Read all the value
		//for loop
		System.out.println("Reading elements  using  for  loop.............");
		/*for(int  i =0;  i<al.size();  i++ )
		{
			System.out.println(al.get(i));
		}*/

		//for...each loop
		System.out.println("Reading   elements  using  for....each loop");
		for(Object e  :  al)
		{
			System.out.println(e);
		}
		
		//iterator()
		System.out.println("Reading  elemnets  using  iterator  method ......");
		
		Iterator  it  = al.iterator();
		while(it.hasNext())
		{
			System.out.println( it.next());
		}
		

	}

}
