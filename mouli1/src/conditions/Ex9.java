package conditions;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		// take input for username(string) , usertype(string)
		// create a scanner object
		Scanner sc = new Scanner(System.in);

		
		
		//take input for username
		System.out.println("enter username");
		String username = sc.next();
			
		// take input for password
		System.out.println("enter password");
		String password = sc.next();
		
		//using logical &&
				if(username.equals("admin") && password.equals("admin")) {
					System.out.println("login success");
				}else {
					System.out.println("login failure");
				}
				//using logical ||		
				if(!username.equals("admin") || !password.equals("admin")) {
					System.out.println("login failure ");
				}else {
					System.out.println("login success");
				}
		
	}
	
}