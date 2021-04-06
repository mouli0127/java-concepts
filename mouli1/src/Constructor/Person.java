package Constructor;
public class Person {
	// instance variables
	int id;
	String name;
	int age;
	
	// param arg constructor [3 args]
	public Person(int id, String name, int age) {
		System.out.println("3 args constructr");
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// zero arg constructor
	public Person() {
		System.out.println("zero arg constructr");
	}

	// param arg constructor [ 2 args]
	public Person(int id, String name) {
		System.out.println("2 args constructr");
		this.id = id;
		this.name = name;
	}
	
	// instance method
		public void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}
}