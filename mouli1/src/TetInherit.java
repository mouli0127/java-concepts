public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person();
		p.setName("testUser2");
		p.setAge(50);
		p.setId(65556);
		
		System.out.println("*************displaying person info**************");
		p.displayPerson(); // shows id,name, age for Person
		
		
		// create obj for employee
		Employee emp = new Employee();
		// set data for inherited props
		emp.setName("testUser1");
		emp.setAge(45);
		emp.setId(12345);
		// set data for child specific props
		emp.setPan("bnadh671a6");
		emp.setPfNo("testPfNo");
		
		System.out.println("*************displaying Employee info**************");
		emp.displayPerson();// shows id,name, age for Employee
		emp.displayEmp();// shows pan,pfNo for Employee
		
	}
	
}