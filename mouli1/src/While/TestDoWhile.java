package While;
import java.util.Scanner;

/**
perfom sum if the input is -ve then stop prog
 */
public class TestDoWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum =0;
	int input= 0;
	do{
		System.out.println("enter number [ negative number to stop ]");
		input = sc.nextInt();
		if(input>0){
			sum = sum + input;
		}
	}while(input>=0);
	System.out.println(sum);
}
}