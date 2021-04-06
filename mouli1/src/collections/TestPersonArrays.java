package collections;
/**
 Req: store the person objs inside the array and display.
 array will have multiple objs.
 and every obj will has id,name
 
 */
public class TestPersonArrays {
	
	public static void main(String[] args) {
		
		Person persons[] = new Person[4];
		
		//insert multiple person objs inside the array
		Person p1 = new Person(2001, "user1", 21);
		persons[0] =p1;
		
		Person p2 = new Person(2002, "user2", 22);
		persons[1] =p2;
		
		Person p3 = new Person(2003, "user3", 23);
		persons[2] =p3;
		
		Person p4 = new Person(2004, "user4", 24);
		persons[3] =p4;
		
		//show
		for(Person p : persons) {
			System.out.println(p.id + " - " + p.name + " - "+ p.age);
		}
		
		
		
	}

}