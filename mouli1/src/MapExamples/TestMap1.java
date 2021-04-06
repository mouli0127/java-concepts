package MapExamples;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class TestMap1 {
	public static void main(String[] args) {
		System.out.println("************* HashMap *******************");
		Map<String,String> map = new HashMap<>();
		
		map.put("100", "kumar");
		map.put("129", "user2");
		map.put("132", "abcd");
		map.put("128", "user1");
		map.put("133", "user6");
		map.put("130", "user3");
		map.put("131", "user4");
		
		System.out.println("******************************");
		for( Entry<String, String> entry : map.entrySet() ){
			String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key = "+ key +" - " + "  value= "+ value);
		}
		
	}
	
}