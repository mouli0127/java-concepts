package LoopsInput;
import java.util.Scanner;

/**
  Req:
   take input for size.
   find factorial.
   
 */
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter size: ");
		int size = sc.nextInt();
		int factorial =1;
		
		for(int i=1; i<=size; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("factorial = "+factorial);
	}
}