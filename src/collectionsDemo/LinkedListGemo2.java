package collectionsDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListGemo2 {

	public static void main(String[] args) {
		
		LinkedList   ll  = new LinkedList();
		
		ll.add("X");
		ll.add("Y");
		ll.add("Z");
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		
		//add  all objects
		LinkedList   lll  = new LinkedList();
		lll.addAll(ll);
		System.out.println("New list :"  + lll);     ///New list :[X, Y, Z, A, B, C]
		
		///REmove  all objects
		lll.removeAll(ll);
		System.out.println("After  removing  the list  : " +lll);          //After  removing  the list  : []
		
		//sorting   in   Collections.sort()
		System.out.println("Before  sorting  :"  + ll);          ///[X, Y, Z, A, B, C]
		Collections.sort(ll);
		System.out.println("After  sorting  :"  + ll);      ////[A, B, C, X, Y, Z]
		
		//reverse  odere
		Collections.sort(ll , Collections.reverseOrder());
		System.out.println("Reverse  order  :"  + ll);        ////  [Z, Y, X, C, B, A]
		
		//Shuffling
		Collections.shuffle(ll);
		System.out.println("Shuffling  the  objects  : "  + ll);         ///   [B, Z, A, X, Y, C]
		
		
		
		
		
		
		

	}

}
