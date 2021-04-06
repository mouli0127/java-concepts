package conditions;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// take input for bank(string)
		// create a scanner object
		Scanner sc = new Scanner(System.in);


			
		// take input for Bank Name
		System.out.println("enter Bank Name");
		String bankname= sc.next();
		
		
		if(bankname.equals("sbi")) {
			System.out.println("ROI=10%");
		}else if (bankname.equals("icici")) {
			System.out.println("ROI=11%");
		}else if(bankname.equals("hdfc")) {
			System.out.println("ROI=12%");
		}else if(bankname.equals("city")){
			System.out.println("ROI= 13%");
			
		}else {
			System.out.println("invalid bank name");
		}
		
	}
	
}