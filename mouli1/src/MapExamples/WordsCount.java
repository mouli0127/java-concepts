package MapExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordsCount {
	public static void main(String[] args) {
		// input list
		List<String> inputWords = Arrays.asList("java", "php", "android", "sap", "php", "java", "win", "ios", "win",
				"hana", "android", "ios", "ios");

		Map<String,Integer> wordsCount = new HashMap<>(); // 
		
		
		for(String word: inputWords) {
			if(wordsCount.containsKey(word)){
				int currCount = wordsCount.get(word)
;
				currCount++;
				
				wordsCount.put( word, currCount);
			}else {
				wordsCount.put( word, 1);
			}
		}
		
		
		
		System.out.println("******************************");
		for( Entry<String, Integer> entry : wordsCount.entrySet() ){
		    System.out.println("Word = "+ entry.getKey() +" - " + "  Count= "+ entry.getValue());
		}
		
		
	}
}