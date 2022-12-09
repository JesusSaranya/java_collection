package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer,  String> hm  = new  HashMap  <Integer,  String>();
	
		//HashMap  hm  = new  HashMap();
		hm.put(102, "John");
		hm.put(103, "Mary");
		hm.put(104, "Danny");
		hm.put(105, "Mary");
		hm.put(106, "Tye");
		hm.put(103, "xan");
		System.out.println(hm);  //  {102=John, 103=Mary, 104=Danny, 105=Mary, 106=Tye}
		System.out.println(hm);  // {102=John, 103=xan, 104=Danny, 105=Mary, 106=Tye}   /// the old value is replaced with new value
		
		System.out.println(hm.get(105));             //  Mary
		
		
		System.out.println(hm.remove(102));
		System.out.println(hm);                ///  {103=xan, 104=Danny, 105=Mary, 106=Tye}
		
		System.out.println(hm.containsKey(101));             // false
		System.out.println(hm.containsKey(103));                // true
		
		System.out.println(hm.containsValue("Mary"));                // true
		
		System.out.println(hm.isEmpty());                      /// false
		
		System.out.println(hm.size());                   ///4
		
		
//		hm.clear();
//		System.out.println(hm);                 //{}
		
		System.out.println(hm.keySet());              /// [103, 104, 105, 106]           ///returns all the key  as  set
		
		for(int  x : hm.keySet())
		{
			System.out.println(x);
		}
		
		
		System.out.println(hm.values());          ///  [xan, Danny, Mary, Tye]     ///  returns   all the  values  as  collection
		
		for(String  s : hm.values())
		{
			System.out.println(s);
		}
		
		
		for(Object  i  : hm.keySet())
		{
			System.out.println(i  +  "     "  + hm.get(i));
		}
		 
		
		System.out.println(hm.entrySet());          /// [103=xan, 104=Danny, 105=Mary, 106=Tye]       /// returns  all the  entry  as  set
		
		for(Object  obj  : hm.entrySet())
		{
			System.out.println(obj);
		}
		
		///Entry  sets methods
		//*********************
		for( Map.Entry  entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+  "    "  +  entry.getValue());
		}
		
		///Iterator  method  to read  all the  key  and  value
		
		   Set   s   = hm.entrySet();
		
		    Iterator   it   = s.iterator();
		    while(it.hasNext())
		    {
		    	Map.Entry  entry  = (Entry)  it.next();
		    	System.out.println(entry.getKey()+  "    "  +  entry.getValue());
		    }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
