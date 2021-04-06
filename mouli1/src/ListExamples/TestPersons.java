package ListExamples;
import java.util.ArrayList;
import java.util.List;

/**
  Req:
  - add multiple person objs to arraylist
  - print objs from list
   
 */
public class TestPersons {
	public static void main(String[] args) {

		// create arraylist
		List<Person> persons = new ArrayList<>();
		

		//create 3 objs
		Person p1 = new Person(1000, "user1", 27);
		Person p2 = new Person(1001, "user2", 28);
		Person p3 = new Person(1002, "user3", 29);
		
		
		//add 3 objs to arraylist
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		
		//show 3 objs from the list
				System.out.println("******************Entered persons ARE :***************");
				for (Person p : persons) {
					System.out.println();
					System.out.println(p.id);
					System.out.println(p.name);
					System.out.println(p.age);
				}
					
				}
				
				
}