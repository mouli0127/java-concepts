package Person;
/**
 simply the logic for create obj + set the data.
 
 */
public class TestPerson3 {
	public static void main(String[] args) {
		Person p1 = getPersonObj(900,"kumar", 56);
		// print
		System.out.println("**********Print p1*****************");
		print(p1);

		Person p2 =getPersonObj(800,"shyam", 54); 		
		// print
		System.out.println("**********Print p2*****************");
		print(p2);

		Person p3 = getPersonObj(700,"karna", 43); 	 
		// print
		System.out.println("**********Print p3*****************");
		print(p3);
	}
	
	public static Person getPersonObj(int id, String name, int age) {
		Person p = new Person();

		// set data
		p.id = id;
		p.name = name;
		p.age = age;
		
		return p;
	}
	
	public static void print(Person p) {
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}