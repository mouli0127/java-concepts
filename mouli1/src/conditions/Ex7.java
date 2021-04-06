package conditions;

import java.util.Scanner;

public class Ex7 {
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
		
		
		if(id<0) {
			System.out.println("invalid id");
		}else if (age<18) {
			System.out.println("valid id");
			System.out.println("age is invalid");
		}else if(!usertype.equals("admin")) {
			System.out.println("valid id");
			System.out.println("valid age");
			System.out.println("usertype is invalid");
		}else {
			System.out.println("valid id");
			System.out.println("valid age");
			System.out.println("valid usertype  ");
		}
		
	}
	
}