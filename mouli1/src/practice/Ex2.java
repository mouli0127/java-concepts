package practice;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	/*	i/p:5
		O/p:
		5 4 3 2 1
		5 4 3 2
		5 4 3
		5 4
		5         */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter rows value : ");
		int rows =sc.nextInt();
		 for (int i=1; i<=rows; i++) 
	        { 
			 
			 for (int j=rows; j>=i; j--)
	            {
	                System.out.print(j);
	            }
	           
	
		System.out.println();
	}
	}
}