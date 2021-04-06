package instanceMethods;
/**
 take two nums 
 and perform add, mul , sub, div using the methods
 */
public class Calculator2 {

	int n1; 
	int n2;
	
	//n1,n2 are instance variables;
	
	public void sum() {
		int res = n1+ n2;
		System.out.println("sum = "+ res);
	}
	
	public void sub() {
		int res = n1 - n2;
		System.out.println("sub = "+ res);
	}
	
	public void mul() {
		int res = n1 * n2;
		System.out.println("mul = "+ res);
	}
	
	public void div() {
		int res = n1 / n2;
		System.out.println("div = "+ res);
	}
}