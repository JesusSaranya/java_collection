package collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		
		LinkedList  l1  =    new  LinkedList();
		
		l1.add("Animal");
		l1.add("Dog");
		l1.add("cat");
		l1.add("Dog");
		
		System.out.println(l1);         ///   [Animal, Dog, cat, Dog]
		l1.addFirst("Tiger");
		l1.addLast("Lion");
		System.out.println(l1);          ///   [Tiger, Animal, Dog, cat, Dog, Lion]
		
		System.out.println(l1.getFirst());          ///  Tiger
		System.out.println(l1.getLast());       /// Lion
		
	     l1.removeFirst();
	     l1.removeLast();
	     System.out.println(   "After  removing  first  and last  elemnet :  "  + l1);              /// [Animal, Dog, cat, Dog]
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
