package SingleInheritConstructor;

public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person("testUser2",50,65556);
		
		System.out.println("*************displaying person info**************");
		p.displayPerson(); // shows id,name, age for Person
		
		
		// create obj for employee
		Employee emp = new Employee("testUser1",45,12345,"bnadh671a6","testPfNo");
		

		System.out.println("*************displaying Employee info**************");
		emp.displayPerson();// shows id,name, age for Employee
		emp.displayEmp();// shows pan,pfNo for Employee
		
	}
	
}