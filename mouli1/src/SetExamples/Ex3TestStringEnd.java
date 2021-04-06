package SetExamples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
- Take input for multiple names and and store every name inside the HashSet
- If the input is "END" then stop taking anymore input.
- display the data using the HashSet.

*/
public class Ex3TestStringEnd {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		// input string till 'STOP' is encountered
		// 3. input the names
		System.out.println("Enter names and type END to stop :");
		
		//take input logic
		while (true) {
			System.out.println("Enter name :");
			String name = sc.next();
			if ("END".equals(name)) {
				break;  // exit from loop
			}
			names.add(name); // add to the arraylist
		}
		
		System.out.println("**********print all*****************");
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
	
}