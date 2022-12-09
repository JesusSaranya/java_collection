package collectionsDemo;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
	
		
		//LinkedHashSetDemo1   <Integer>  lset  =  new  LinkedHashSetDemo1 <Integer> ();
		//HashSet   ls  =  new  HashSet();
		LinkedHashSet   ls  =  new  LinkedHashSet();
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(500);
		
		//System.out.println(ls);     /// [400, 100, 500, 200, 300]
		System.out.println(ls);     ///[100, 200, 300, 400, 500]
		
		
		
		
		
		
		

	}

}
