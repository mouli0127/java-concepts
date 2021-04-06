package StaticVariable;
public class TestDAO {
public static void main(String[] args) {
	Dao.showCount();  // call the static method , prints 900
	
	Dao.updateCount(90); // add 90 to the static variable
  
	Dao.showCount();
}
}
/** instance variables   + instance method     + constr   ---> 1 set
(specific data)        ( any logic)     ( initializing the i.v. when obj is created)

static variables    + static methods    + static block ---> 1 set
(common data)      ( logic for s.v.)    ( initializing the s.v. during class loading) */
