package exception;

public class TestHandle4 {
	public static void main(String[] args) {
		String name = null;
		try {
			int len = name.length();
			System.out.println("length = " + len);
		} catch (NullPointerException ex) {
			System.out.println("string obj cnanot be null");
		}

	}
}