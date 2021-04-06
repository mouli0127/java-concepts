package MapExamples;
import java.util.HashMap;
import java.util.Map;

public class TestInterview1 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("128", "user1");
		map.put("133", "user7");
		
		// get the size
		System.out.println(map.size());
		System.out.println(map.get("128"));
		System.out.println(map.get("133"));
		System.out.println(map.get("136"));
		
		System.out.println("********* Add dupliacte key **********");
		map.put("128", "user123");  		//user1 is replaced with  user123
		// when same key is added, then the value will be replaced.
		
		// get the size
		System.out.println(map.size());	
		System.out.println(map.get("128"));
		
	}
	
}