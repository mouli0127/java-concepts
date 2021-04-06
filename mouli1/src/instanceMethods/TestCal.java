package instanceMethods;
import java.util.Scanner;

public class TestCal {
	public static void main(String[] args) {
		//take two nums as input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = sc.nextInt();
		
		//
		Calculator c = new Calculator();
		c.sum(num1, num2);
		c.sub(num1, num2);
		c.mul(num1, num2);
		c.div(num1, num2);
	}
}