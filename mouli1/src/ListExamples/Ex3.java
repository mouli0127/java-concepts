	package ListExamples;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		List<String> names = new LinkedList<>();
		
		//add elements
		
		 names.add("kumar"); // 0 position
	     names.add("shyam"); // 1 position
	     names.add("ram");   // 2 position
	     names.add("raju");
	     
	     
	     System.out.println("**********print all*****************");
	     for(String name: names) {
	    	 System.out.println(name);
	     }
		
	}
}