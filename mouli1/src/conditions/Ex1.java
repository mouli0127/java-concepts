package conditions;
import java.util.Scanner;

public class Ex1 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();

		System.out.println("enter num2");
		int num2 = sc.nextInt();
		
		if( num1 == num2) {
			System.out.println("numbers are equal");
		}else{
			System.out.println("numbers are not equal");
		}
		

	}
	
}