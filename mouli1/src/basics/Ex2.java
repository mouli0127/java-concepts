package basics;

public class Ex2 {

	public static void main(String[] args) {
		//[natural numbers]
		int a =90;
		long b = 13131313131314214L;
		
		//[decimal numbers]
		float c = 90.131313f;
		double d = 13131.242414142142141d;
		
		
		//text
		char e ='4';
		String f ="Iam krishna. iam a developer";
		
		boolean h =true;
		boolean i = false;
		
		//print all in seperate line
		System.out.println("**********************************************************");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		System.out.println(i);	
		//print all in one line  [use + for concatenation]
		System.out.println("**********************************************************");
		System.out.println( a + "  " +
							b + "  " +
							c + "  " +
							d + "  " +
							e + "  " +
							f + "  " +
							h + "  " +
							i + "  " 
				);
	}
	
}
