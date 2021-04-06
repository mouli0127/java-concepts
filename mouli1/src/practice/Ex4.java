package practice;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/* i/p:5
		O/p:
		1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15*/
		
		
		int k=1;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter rows value");	
		 int rows = sc.nextInt();
	  
	     for (int i=1; i<=rows; i++) {
	    	 for(int j=1;j<i+1;j++) {
	    		 System.out.print(k++ +" ");
	    	 }
	    	 System.out.println();
	    	 
				
			
	    	 
	     }
		
	}

}