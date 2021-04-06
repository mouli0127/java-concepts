package methods;
public class TestOperations8 {
	public static void main(String[] args) {
		Operations op = new Operations();
		 
		int v1= op.big(10,20);
		int v2= op.big(110,210);
		int v3= op.big(410,270);
		int v4= op.big(610,2098);
		
		System.out.println("big = "+v1);
		System.out.println("big = "+v2);
		System.out.println("big = "+v3);
		System.out.println("big = "+v4);
		
	}
}