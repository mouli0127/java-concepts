package strOperations;
import java.util.Scanner;

public class TestString2 {
public static void main(String[] args) {
	//take string as input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String ::");
	String input = sc.nextLine();
	
	int length = input.length();
	System.out.println("length = "+ length);
	
	//check if the string ends with bye
		boolean status = input.endsWith("bye");
		System.out.println("endswith bye :" + status);
		
		//check if the string starts with hi
		boolean status1 = input.startsWith("hi");
		System.out.println("startsWith hi :" + status1);
		
		//convert to upper
		System.out.println(input.toUpperCase());
		
		//convert to lower
		System.out.println(input.toLowerCase());
		
		//compare two string by ingnoring the case ex:: comparing user name 
		System.out.println("compare with equalsIgnoreCase  ::"+"india".equalsIgnoreCase(input));
		
		//compare  two string with exact match ex:: comparing password
		System.out.println("compare with equals::"+"india".equals(input));
		
		
	
}
}