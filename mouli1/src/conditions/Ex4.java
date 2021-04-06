package conditions;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter str1");
	    String str1 = sc.next();

		System.out.println("enter str2");
		 String str2 = sc.next();
		
		if( str1 .equals(str2)) {
			System.out.println("strings are equal");
		}else{
			System.out.println("strings are not equal");
		}
		

	}
	
}