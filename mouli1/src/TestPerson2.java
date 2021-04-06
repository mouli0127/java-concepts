/**
 create two objects
 set the data for two objs
 display the data for two objs
 */
public class TestPerson2 {
	public static void main(String[] args) {
		//create the object
		Person p1 = new Person();
		
		// set the data
	   p1.id = 9000;
	   p1.name ="kumar";
	   p1.age= 56;
	   
	   //display the data
	   System.out.println(p1.id);
	   System.out.println(p1.name);
	   System.out.println(p1.age);
	   
	   
		//create the object
		Person p2 = new Person();
		
		// set the data
		p2.id = 8000;
		p2.name ="shyam";
		p2.age= 32;
	   
	   //display the data
	   System.out.println(p2.id);
	   System.out.println(p2.name);
	   System.out.println(p2.age);
		
	}
}