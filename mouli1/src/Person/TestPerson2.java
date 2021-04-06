package Person;
/**
 simply the logic for printing the object data.
 */
public class TestPerson2 {
	public static void main(String[] args) {
		Person p1 = new Person();

		// set data
		p1.id = 900;
		p1.name = "kumar";
		p1.age = 56;

		// print
		System.out.println("**********Print p1*****************");
		print(p1);

		Person p2 = new Person();

		// set data
		p2.id = 800;
		p2.name = "shyam";
		p2.age = 54;

		// print
		System.out.println("**********Print p2*****************");
		print(p2);

		Person p3 = new Person();

		// set data
		p3.id = 700;
		p3.name = "karna";
		p3.age = 43;

		// print
		System.out.println("**********Print p3*****************");
		print(p3);
	}
	
	public static void print(Person p) {
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
	
}