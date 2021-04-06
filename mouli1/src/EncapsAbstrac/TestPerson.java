package EncapsAbstrac;

/**
 * create the object set the data display the data
 */
public class TestPerson {
	public static void main(String[] args) {
		// create the object
		Person p1 = new Person();

		// set the data
		// p1.id = 9000;
		p1.setAge(9000);

		// p1.name ="kumar";
		p1.setName("kumar");

		// p1.age= 56;
		p1.setAge(56);

		// display the data
		// System.out.println(p1.id);
		System.out.println(p1.getId());

		// System.out.println(p1.name);
		System.out.println(p1.getName());

		// System.out.println(p1.age);
		System.out.println(p1.getAge());

	}
}