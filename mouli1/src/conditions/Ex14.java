package conditions;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		// take input for  x(int),y(int),z(int)
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// take input for x
		System.out.println("enter value of x :");
		int x = sc.nextInt();
		// take input for y
		System.out.println("enter value of y :");
		int y = sc.nextInt();
		// take input for x
		System.out.println("enter value of z :");
		int z = sc.nextInt();
		
		if(x > y && x > z)
        {
            System.out.println("bigger number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("bigger number is:"+y);
        }
        else
        {
            System.out.println("bigger number is:"+z);
        }
		
	}
}