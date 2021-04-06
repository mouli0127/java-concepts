public class Person {
	 String name;
	 int age;
	 int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}

}