package Codes;

import java.util.LinkedHashMap;


public class TextParser {

public static void main(String[] args) {
		
		String input= "This problem is simple. Simple problems need attention.";
		System.out.println(wordsCount(input));
		
	}
	
	public static LinkedHashMap<String,Integer> wordsCount(String input){
		input=input.trim().toLowerCase();
		LinkedHashMap<String, Integer> wordsCountMap= new LinkedHashMap<>();
		String words[]= input.split("\\W+"); //every non letter like space, spcl characters
		for (String s : words) {
			if(wordsCountMap.containsKey(s))
				wordsCountMap.put(s, wordsCountMap.get(s)+1);
			else
				wordsCountMap.put(s, 1);			
		}		
		return wordsCountMap;
	}

}

