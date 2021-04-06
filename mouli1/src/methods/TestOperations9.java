package methods;
public class TestOperations9 {
	public static void main(String[] args) {
		Operations op = new Operations();
		 
		int v1= op.small(10,20);
		int v2= op.small(110,210);
		int v3= op.small(410,270);
		int v4= op.small(610,2098);
		
		System.out.println("small = "+v1);
		System.out.println("small = "+v2);
		System.out.println("small = "+v3);
		System.out.println("small = "+v4);
		
	}
}