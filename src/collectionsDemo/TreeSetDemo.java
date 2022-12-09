package collectionsDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet  <Integer>  ts = new  TreeSet  <Integer> ();
		ts.add(1);
		ts.add(2);
		ts.add(6);
		ts.add(3);
		ts.add(5);
		ts.add(8);
		ts.add(7);
		System.out.println("Elements  are  sorted  in  ascending  order  :"  +  ts);           //  [1, 2, 3, 5, 6, 7, 8]
		
		//first
		System.out.println("First  element :"  + ts.first());     //1
		//last
		System.out.println("Last  element :"  + ts.last());     //8
		//headset
		System.out.println("Values  lesser  than  given  value  : "  + ts.headSet(3));     // [1, 2]
		//tailset
		System.out.println("Values  equal  to  higher than   given  value :"  + ts.tailSet(6));    //[6, 7, 8]
		//subset
		System.out.println("Subset  values :"  + ts.subSet(1, 5));          // [1, 2, 3]
		//comparator()
		System.out.println("Comparator  returns  null if the sorting  is default  order  :"  + ts.comparator());       //  null
		//higher
		System.out.println("Higer given next value :"  + ts.higher(6));      ///7
		//lower
		System.out.println("Lower  given previous  value :"  + ts.lower(3));  ////2
		//pool First
				System.out.println("Pool  First   and  delete  :"  + ts.pollFirst());   //1
		//pool Last
			System.out.println("Pool  Last  and  delete   :"  + ts.pollLast());   //8
			//After  pooling
			System.out.println("After   pooling  :"  +  ts);   ///  [2, 3, 5, 6, 7]
		//DesendingSet
			System.out.println("Desending  order  :"   +  ts.descendingSet());   /// [7, 6, 5, 3, 2]
			
			//Normal  Iterator
			Iterator <Integer>   iterator  =  ts.iterator();   //
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		
		//Descending   iterator
			Iterator  <Integer>  descenIterator  = ts.descendingIterator();
			while(descenIterator.hasNext())
			{
				System.out.println(descenIterator.next());
			}
		
		
			
			
			
			
			
			
			
			
			

	}

}
 