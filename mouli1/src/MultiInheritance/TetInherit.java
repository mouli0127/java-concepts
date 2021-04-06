package MultiInheritance;

public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person();
		p.name = "testUser2";
		p.age = 50;
		p.id = 65556;
		
		System.out.println("*************displaying person info**************");
		p.displayPerson(); // shows id,name, age for Person
		
		
		// create obj for employee
		Employee emp = new Employee();
		// set data for inherited props
		emp.name = "testUser1";
		emp.age = 45;
		emp.id = 12345;
		// set data for child specific props
		emp.pan = "bnadh671a6";
		emp.pfNo = "testPfNo";
		

		System.out.println("*************displaying Employee info**************");
		emp.displayPerson();// shows id,name, age for Employee
		emp.displayEmp();// shows pan,pfNo for Employee
		
		
		
		System.out.println("***************printing Staff info******************");
		Staff sf = new Staff();
		sf.id = 23;
		sf.age = 29;
		sf.name = "user1";
		sf.pan = "bncpu65ad";
		sf.pfNo = "pf@@@";
		sf.contractID = "contct@@@@";
		sf.contractPeriod = "5";
		
		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
		
	}
	
}