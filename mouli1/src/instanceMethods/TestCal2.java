package instanceMethods;
import java.util.Scanner;

public class TestCal2 {
	public static void main(String[] args) {
		//take two nums as input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = sc.nextInt();
		
		//create obj
		Calculator2 c = new Calculator2();
		
		//set the data
		c.n1 = num1;
		c.n2= num2;
		
		//call methods using obj
		c.sum();
		c.sub();
		c.mul();
		c.div();
	}
}