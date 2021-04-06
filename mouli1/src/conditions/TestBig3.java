package conditions;

import java.util.Scanner;

public class TestBig3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if(a>b) {
			//bigger can be a and c
			if( a>c ) {
				System.out.println("bigger = "+ a);
			}else {
				System.out.println("biger ="+c);
			}
			
		}else {
			//bigger can be b and c
			if( b>c ) {
				System.out.println("bigger = "+b);
			}else {
				System.out.println("biger ="+c);
			}
		}
	}
}