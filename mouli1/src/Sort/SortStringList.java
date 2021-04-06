package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
Sorting collections:
------------------------
use  Collections.sort() method to sort any collection in ASC order
use  Collections.sort() method with Collections.reverseOrder()  to sort any collection in DESC order

*/

public class SortStringList {
	public static void main(String[] args) {
	    List<String> names = Arrays.asList("Cow", "Zebra","Bat", "Apple","Elephant","Mango");
	    
	    System.out.println("before sorting");
		System.out.println(names);
		

		System.out.println("********************ASC ORDER***********************");
		Collections.sort(names);
		
		System.out.println("After sorting ");
		System.out.println(names);
		
		
		System.out.println("********************DESC ORDER***********************");
		Collections.sort(names, Collections.reverseOrder());
		
		System.out.println("After sorting");
		System.out.println(names);
		
	}
}