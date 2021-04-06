package strOperations;
public class TestString3 {
public static void main(String[] args) {
	 
	//replace
	String old ="kumar";
	String newStr ="shyam";
	String input = "hello mkumar how are you kumar";
	
	System.out.println("Before replace :: "+input);
	
	System.out.println("After replace :: "+input.replace(old, newStr));
	
	
	//how to remove blank spaces in the input string prefix and suffix
		String data ="          hello welcome to java world                ";
		System.out.println("Before:--"+data+"--");
		System.out.println("To Trim:--"+data.trim()+"--");
		
		input = "hello mkumar how are you kumar";
		//how to find the substring for the given string : use substring() method
		System.out.println("sub string from 6 to 10:: "+input.substring(5, 10));
		System.out.println("sub string from 6 to end:: "+input.substring(5));
		
		//how to find if the second string is a  substring of the 1st string : use indexOf() method
		String mainString ="Hello india is my country";
		   
		String s1 = "Hello india is my country";
		String s2 = "india is my country";
		String s3 = "my country";
		String s4 = "hell how are you";
		
		
		System.out.println(mainString.indexOf(s1));
		System.out.println(mainString.indexOf(s2));
		System.out.println(mainString.indexOf(s3));
		System.out.println(mainString.indexOf(s4));
		
		// indexOf retuns the position number
			// if indexOf returns -1 , second string is not a substring of the 1st string
			// if indexOf returns >=0 , second string is a substring of the 1st string
		
	
}
}