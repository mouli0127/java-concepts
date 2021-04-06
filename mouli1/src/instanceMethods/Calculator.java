package instanceMethods;
/**
 take two nums 
 and perform add, mul , sub, div using the methods
 */
public class Calculator {

	public void sum(int n1 , int n2) {
		int res = n1+ n2;
		System.out.println("sum = "+ res);
	}
	
	public void sub(int n1 , int n2) {
		int res = n1 - n2;
		System.out.println("sub = "+ res);
	}
	
	public void mul(int n1 , int n2) {
		int res = n1 * n2;
		System.out.println("mul = "+ res);
	}
	
	
	public void div(int n1 , int n2) {
		int res = n1 / n2;
		System.out.println("div = "+ res);
	}
	
	
}