package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		
		String   arr [ ] = {"Dog" ,  "Cat" , "Fox"  , " papa"};
		
		for(String  value  : arr)
		{
			System.out.println(value);
		}
		
		
		//Convert array into  ArrayList
		ArrayList  al  = new  ArrayList(Arrays.asList(arr));
		System.out.println(  "convert  array  into  arrayList :"  +al);
		
		
		
		
		
		
		
		
		
		
		

	}

}
