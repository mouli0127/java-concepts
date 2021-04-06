package Constructor;
public class TestConst1 {
public static void main(String[] args) {
	Person p1 = new Person();// calls zero-arg constr
	Person p2 = new Person(3900, "user5");// calls 2-arg constr
	Person p3 = new Person(20004,"user4",32);// calls 3-arg constr
	
	
	p1.display();
	p2.display();
	p3.display();
}

}