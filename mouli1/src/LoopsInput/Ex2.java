package LoopsInput;
import java.util.Scanner;

/**
  Req#2:
   take input for size
  print hello for size number of times
  print numbers  from 1 till the size
 
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter size: ");
		int size = sc.nextInt();
		
		
		for(int i=1; i<=size; i++) {
			System.out.println(i);
		}
	}
}