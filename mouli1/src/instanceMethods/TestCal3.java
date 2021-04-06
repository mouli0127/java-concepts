package instanceMethods;
public class TestCal3 {
	public static void main(String[] args) {
		//create obj
		Calculator2 c1 = new Calculator2();
		Calculator2 c2 = new Calculator2();
		
		//set the data
		c1.n1 = 90;
		c1.n2= 30;
		
		//set the data
		c2.n1 = 100;
		c2.n2 = 25;
		
		//call methods using obj
		System.out.println("******************* Opeartions on c1 **********************");
		c1.sum();
		c1.sub();
		c1.mul();
		c1.div();
		
		//call methods using obj
		System.out.println("******************* Opeartions on c2 **********************");
		c2.sum();
		c2.sub();
		c2.mul();
		c2.div();
	}
}