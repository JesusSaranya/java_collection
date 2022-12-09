package collectionsDemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		 HashSet  <Integer>   evenNumber  =  new HashSet  <Integer>();
		 evenNumber.add(3);
		 evenNumber.add(4);
		 evenNumber.add(5);
		 evenNumber.add(6);
		 evenNumber.add(7);
		System.out.println(evenNumber);        ////  [3, 4, 5, 6, 7]
		
		
		HashSet <Integer> num  =  new  HashSet <Integer> ();
		
		///  addAll
		System.out.println(num.addAll(evenNumber));
		num.add(10);
		System.out.println(num);             ///   [3, 4, 5, 6, 7, 10]
		
		//removeall
		num.removeAll(evenNumber);
		System.out.println(num);         //[10]
		
		//
		
		
		
		
		
		
		

	}

}
