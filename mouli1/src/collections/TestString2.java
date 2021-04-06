package collections;
/**
 Create a string array with data
 - Insert
 - Read by position
 - Read all
 */
public class TestString2 {
	public static void main(String[] args) {
		String[] names = {"kumar","shyam","ram", "raj","nandini","teju"};
		
		// read by position
		System.out.println("********** Read by position **************");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		System.out.println("********** Read all elements **************");
		for(String name: names) {
			System.out.println(name);
		}
	}
}