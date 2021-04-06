package passByRef;
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person(20004,"user4",32);// calls 3-arg constr
		p1.display();
		
		modify(p1);
		
		p1.display();
		
	}

	private static void modify(Person pObj) {
		pObj.id = 69000;
		pObj.name="ram";
		pObj.age = 76;
	}
}