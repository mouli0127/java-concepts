package ListExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
- Take input for multiple names and and store every name inside the arraylist
- If the input is "END" then stop taking anymore input.
- display the data using the arraylist.
- avoid duplicates

*/
public class Ex3TestStringEnd2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
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
			if(!names.contains(name)) {
				names.add(name); // add to the arraylist
			}
		}
		
		System.out.println("**********print all*****************");
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
	
}