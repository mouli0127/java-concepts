package While;
import java.util.Scanner;

/**

Take the names as input continuosly 
if the input value is "end"
then stop taking the inputs and print what are the names entered so far

Input:
-----------------
Enter name::
user1

Enter name::
kumar

Enter name::
raju

Enter name::
ramana

Enter name::
end

Output:
-------------------
names == user1 kumar raju ramana


 */
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		String input ="";
		
		while(!input.equals("end")) {
			System.out.println("enter name");
			input = sc.next();
			if(!input.equals("end"))
				result = result + " " + input;
		}
		
		System.out.println("Result names= "+ result);
		
	}
}