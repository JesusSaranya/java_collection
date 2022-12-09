package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList  al  =new  ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList   al_dup  = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);     ///[X, Y, Z, A, B, C]
		
		al_dup.removeAll(al);
		System.out.println( " After  Removing : " + al_dup);    //// After  Removing : []
		
		
		//Sort  an  array  list======collections.sort()
		System.out.println("Elements in the array list :"  + al);      ////[X, Y, Z, A, B, C]
		
		Collections.sort(al);
		System.out.println("Elements in the arrayList  after sorting  :"  + al);   ///Elements in the arrayList  after sorting  :[A, B, C, X, Y, Z]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the arrayList  after sorting  reverse order:"  + al);    ////[Z, Y, X, C, B, A]
		
		//Shuffling - collections . shuffle
		Collections.shuffle(al);
		System.out.println("Elements in the arrayList  after shuffling:"  + al);       ///[Z, X, Y, B, A, C]
		
		
		
		
		
		
		
		
		

	}

}
