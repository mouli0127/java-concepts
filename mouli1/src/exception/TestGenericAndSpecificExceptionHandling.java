package exception;

/**
 * write common exception handling for group of exception classes.
 * ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException
 * ==> print "client error"
 * 
 * and write global exception ==========> print "server error"
 * 
 * 
 */

public class TestGenericAndSpecificExceptionHandling {
	public static void main(String[] args) {
		String name = null;
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];
		try {
//can fail due to number format
			int num = Integer.parseInt("123");
			System.out.println(" after conversion ::" + num);

// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
// common exception handling for dividebyzero/Nullpointer/arrayindex
			System.out.println("client error :" + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("server error");
		}
	}
}