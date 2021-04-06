package instanceMethods;
public class TestPerson {
	public static void main(String[] args) {

		// create obj + set the data for p1
		Person p1 = new Person();
		p1.id = 2010;
		p1.name = "user2";
		p1.age = 25;
		System.out.println("**********Print p1*****************");
		p1.show();// prints the id,name, age for p1 obj
		
		// create obj + set the data for p2
		Person p2 = new Person();
		p2.id = 2011;
		p2.name = "user3";
		p2.age = 26;
		System.out.println("**********Print p2*****************");
		p2.show();// prints the id,name, age for p2 obj
		
		// create obj + set the data for p3
		Person p3 = new Person();
		p3.id = 2012;
		p3.name = "user5";
		p3.age = 20;
		System.out.println("**********Print p3*****************");
		p3.show();// prints the id,name, age for p3 obj
	}
}


//if the method is called using the object then logic inside the method is applied on the calling object