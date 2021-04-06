package basics;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the address");
		String address = sc.nextLine();
		
		System.out.println("enter name");
		String word = sc.next();
		
		System.out.println("enter age");
		int x = sc.nextInt();
		
		System.out.println("enter any long:");
		long z = sc.nextLong();
		
		System.out.println("enter any float:");
		float n3 = sc.nextFloat();
		
		System.out.println("enter any double:");
		double n4 = sc.nextDouble();
		
		System.out.println("***********Output ::******************");
		System.out.println(address);
		System.out.println(word)
;
		System.out.println(x);
		System.out.println(z);
		System.out.println(n3);
		System.out.println(n4);
		

	}

}
