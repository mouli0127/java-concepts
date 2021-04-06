package exception;

import java.util.Scanner;

/**
 * How to convert string to int? ->Use Integer.parseInt(age)
 * 
 * Take string as input and convert to int
 */
public class TestHandle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
//take string as input
		String age = sc.next();

// convert str to int
		try {
			int ageInt = Integer.parseInt(age);
			System.out.println("after conversion age int :: " + ageInt);
		} catch (NumberFormatException ex) {
			System.out.println("invalid input..please provide a number");
		}
		System.out.println("exit");
	}
}
//java creates obj for NumberFormatException