package collectionsDemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		
		TreeMap  <String  , String>  tm  = new   TreeMap  <String  , String>();
		tm.put("Dog", "Animal");
		tm.put("Cat", "Animal");
		tm.put("Rat", "Animal");
		tm.put("Lion", "Animal");
		tm.put("Animal", "Tiger");
		tm.put("Animal", "Horse");
		//System.out.println(tm);      ///   {Cat=Animal, Dog=Animal, Horse=Animal, Lion=Animal, Rat=Animal, Tiger=Animal}
		
		///After   addind  duplicates  the  existing  value  over ride  ..
		System.out.println("After   adding   duplicates  keys  :"   +  tm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
