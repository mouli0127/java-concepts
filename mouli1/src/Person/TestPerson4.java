package Person;
import java.util.Scanner;

/**
take id,name,age as input from console for p1,p2,p3.

simply the logic for create obj + set the data + print data
 
 */
public class TestPerson4 {
	public static void main(String[] args) {
		Person p1 = getPersonObj();
		// print
		System.out.println("**********Print p1*****************");
		print(p1);

		Person p2 =getPersonObj(); 		
		// print
		System.out.println("**********Print p2*****************");
		print(p2);

		Person p3 = getPersonObj(); 	 
		// print
		System.out.println("**********Print p3*****************");
		print(p3);
	}
	
	public static Person getPersonObj() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();
		
		System.out.println("enter name");
		String name = sc.next();
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
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