package conditions;
import java.util.Scanner;

public class TestBig5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//int d = sc.nextInt();
		
		int big = a;
		
		if(b>big) {
			big = b;
		}
		
		if(c>big) {
			big= c;
		}
		
		 
		System.out.println("big =" + big);
	}
}