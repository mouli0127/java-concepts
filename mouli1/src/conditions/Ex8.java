package conditions;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		// take input for id(int) , age(int) , usertype(string)
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		// take input for id
		System.out.println("enter id");
		int id = sc.nextInt();
		
		//take input for age
		System.out.println("enter age");
		int age = sc.nextInt();
			
		// take input for usertype
		System.out.println("enter usertype");
		String usertype = sc.next();
		
		// id should be positive
		if (id > 0 && age>18 && usertype .equals("admin")) {
			System.out.println("valid data");
		} else {
			System.out.println("invalid data");
		}
		
	}
}