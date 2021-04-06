package Person;
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();

		// set data
		p1.id = 900;
		p1.name = "kumar";
		p1.age = 56;

		// print
		System.out.println("**********Print p1*****************");
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);

		Person p2 = new Person();

		// set data
		p2.id = 800;
		p2.name = "shyam";
		p2.age = 54;

		// print
		System.out.println("**********Print p2*****************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);

		Person p3 = new Person();

		// set data
		p3.id = 700;
		p3.name = "karna";
		p3.age = 43;

		// print
		System.out.println("**********Print p3*****************");
		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
}