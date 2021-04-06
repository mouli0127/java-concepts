package Sort;
import java.util.Arrays;
import java.util.Collections;

/**
 Sorting arrays:
------------------------

use     Arrays.sort(intArr,Collections.reverseOrder()); method to sort any desc in ASC order
use Arrays.toString() method for printing

 */
public class ArraysSort2 {
public static void main(String[] args) {
	 //sort primitives array like int array
    Integer[] intArr = {5,9,1,10,3,10,78,23,4,7};
     
    System.out.println("Before sort:: " +Arrays.toString(intArr));
    
    Arrays.sort(intArr,Collections.reverseOrder());
    
    System.out.println("After sort:: " +Arrays.toString(intArr));
    
}

}