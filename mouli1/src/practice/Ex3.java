package practice;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter rows value");	
		 int rows = sc.nextInt();
	  
	     for (int i=1; i<=rows; i++)
	     {
	         for (int j=1; j<=i; j++)
	         {
	             System.out.print("*");
	         }
	       System.out.println();
	     }
	     for (int i=1; i<=rows; i++) 
	        { 
			 
			 for (int j=rows; j>=i; j--)
	            {
	                System.out.print("*");
	            }
	           
	
		System.out.println();
	}
	}
}