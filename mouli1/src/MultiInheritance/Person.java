package MultiInheritance;
/* 
Person has id,name, age
Employee has id,name, age , pan , pf
Staff has id,name, age , pan , pf , contractId , contractPeriod.

solution:
Person is the parent class for Employee.
Employee is the parent class for Staff. 

Staff class will get inheritance from Person and Employee.

create the objs , set data and print.

*/
public class Person {
	  String name;
	  int age;
	  int id;
	  
	  public void displayPerson(){
		  System.out.println(name);
		  System.out.println(id);
		  System.out.println(age);
	  }
	  
}