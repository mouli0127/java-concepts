package LoopsInput;
import java.util.Scanner;
/**
INPUT:
enter size
5

enter num 1
10
enter num 2
30
enter num 3
40
enter num 4
60
enter num 5
20

OUTPUT:
Big : 60
small : 10
Sum : 160

*/
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		//take the  size
		System.out.println("enter size: ");
		int size = sc.nextInt();
		int big =0;
		int small= 0;
		int sum = 0;
		
		for(int i =0; i<size ; i++) {
			System.out.println("Enter Num : "+ (i+1));
			int num = sc.nextInt();
			
			sum = sum + num;
			
			if(num>big) {
				big=num;
			}
			
			if(i==0 && num>0) {
				small= num;
			}
			
			if(num<small) {
				small=num;
			}
			
		}
		
		System.out.println("Bigger = "+ big);
		System.out.println("small = "+ small);
		System.out.println("Sum = "+ sum);
		 
		
	}
}