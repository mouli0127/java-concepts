package conditions;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// take input for  color(int)
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// take input for color
		System.out.println("enter color number :");
		int color = sc.nextInt();
		
		if(color == 1) {
			System.out.println("Red");
		}else if (color==2) {
			System.out.println("Yellow");
		}else if(color==3) {
			System.out.println("Green");
		}else if(color==4){
			System.out.println("Blue");
			
		}else {
			System.out.println("invalid color");
		}
		
	}
}