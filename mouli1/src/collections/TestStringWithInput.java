package collections;

 /**String array 
  - Take size as input
  - Take data as input for size number of times
  - store every data inside the array
  - display the data using the array.
  
 */
import java.util.Scanner;
public class TestStringWithInput {
	public static void main(String[] args) {
		//take size as input
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String[] names = new String[size]; // names is array of size 6
		

		//add multiples names inside the array
		for(int i=0;i< size;i++) {
			System.out.println("enter name: ");
			String name = sc.next();
			names[i] = name;
		}
		
		System.out.println("********** Read all elements **************");
		for(String name: names) {
			System.out.println(name);
		}
	}		
}