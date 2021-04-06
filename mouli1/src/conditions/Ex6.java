package conditions;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		// take input for id(int) , age(int) , usertype(string)
		// create a scanner object
		Scanner sc = new Scanner (System.in);

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
		if (id > 0) {
			System.out.println("valid id");
			// age should be greater than 18
			if (age > 18) {
				System.out.println("valid age");
				// usertype should be "admin"
				if (usertype.equals("admin")) {
					System.out.println("valid usertype");
				} else {
					System.out.println("invalid usertype");
				}
			} else {
				System.out.println("invalid age");
			}
		} else {
			System.out.println("invalid id");
		}
		
	}
	
}