package ListExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex2 {

	public static void main(String[] args) {
		
		List<String> names = new Vector<>();
		
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