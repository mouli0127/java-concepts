package While;
import java.util.Scanner;

/**

dont take size as input
take nums as input
and perform sum 
if the sum reaches 100 , stop and print final sum
if the input is a negative number then dont perform any sum.

continue : skip current run ad go to the next run
 */

public class Ex8 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	
	
	while(sum<=100) {
		System.out.println("Enter num :");
		int num = sc.nextInt();
		if(num<0) {
			continue;
		}
		sum = sum + num;
	}
	
	
	System.out.println("sum = "+sum);
}


}