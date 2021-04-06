package Polymorphism;
public class TestCalculator {
	public static void main(String[] args) {
		//create obj
		Calculator cal = new Calculator();
		
		int sum1=cal.add(5,6); // pass two ints
		System.out.println(sum1);
		
		
		int sum2 = cal.add(1,2,3);// pass 3 ints
		System.out.println(sum2);
		
		long sum3 = cal.add(343535l, 525252l); // long , long
		System.out.println(sum3);
		
	 	float sum4 = cal.add(12f,  10.0f);//float, float
		System.out.println(sum4);
		
		 cal.add(123 , 123f);// int , float
		 cal.add(12f, 5656); //float, int
		
	}
	
}