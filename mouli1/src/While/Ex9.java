package While;
import java.util.Scanner;

/**

dont take size as input
take nums as input
and perform sum 
if the sum reaches 100 , stop and print final sum
if the input is a negative number then dont perform any sum.
if the input value is 999 , then stop the prog and print final sum.

continue : skip current run ad go to the next run
break : stop all the iterations and it will come out of the loop
 */

public class Ex9 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	while(sum<=100) {
		System.out.println("Enter num :");
		int num = sc.nextInt();
		if(num<0) {
			continue;
		}
		if(num==999) {
			break;
		}
		sum = sum + num;
	}
	System.out.println("sum = "+sum);
}
}