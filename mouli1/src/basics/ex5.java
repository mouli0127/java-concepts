package basics;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1");
		 int num1 = sc.nextInt();
		 
		 System.out.println("enter num2");
		 int num2 =sc.nextInt();
		 
		 int sum = num1 + num2;
		 
		 int sub = num1 - num2;
		 
		 int mul = num1 * num2;
		 
		 int div = num1/num2;
		 
		 int rem =num1%num2;
		 
		 System.out.println("addition value = "+ sum);
		 System.out.println("substraction  value = "+ sub);
		 System.out.println("multiplication value = "+ mul);
		 System.out.println("division value = "+ div);
		 System.out.println("remainder value = "+ rem);
}
}
