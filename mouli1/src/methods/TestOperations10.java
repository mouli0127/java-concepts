package methods;
import java.util.Scanner;

public class TestOperations10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter 4 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		Operations op = new Operations();
		
		//int bigger = op.big(a, op.big(b, c));
		int bigger = op.big(a,b);
		bigger = op.big(bigger,c);
		bigger = op.big(bigger,d);
		
		System.out.println("Bigger - "+bigger);
		
		

	}
}