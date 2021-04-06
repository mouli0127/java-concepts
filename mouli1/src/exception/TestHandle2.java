package exception;

public class TestHandle2 {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 0;

		try {
			int x = num1 / num2;
			System.out.println(x);
		} catch (ArithmeticException ex) {
			System.out.println("num2 cannot be zero.");
		}
		System.out.println("Program ends");

	}
}
//java created obj for ArithmeticException