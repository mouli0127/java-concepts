package passByRef;
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
	
	// instance method
	public void display() {
		System.out.println("********************************");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}