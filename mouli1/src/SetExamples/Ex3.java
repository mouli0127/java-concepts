package SetExamples;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		
		Set<String> names = new LinkedHashSet<>();
		
		//add elements
		names.add("kumar");  
		names.add("shyam");  
		names.add("ram");  
		names.add("raju");
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("hana");
		names.add("apple");
		names.add("java");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");
	     
	     
	     System.out.println("**********print all*****************");
	     for(String name: names) {
	    	 System.out.println(name);
	     }
		}
}