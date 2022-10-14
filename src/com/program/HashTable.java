package com.program;

import java.util.HashMap;
import java.util.Set;

public class HashTable {

	public static void frequencyWord(String inputString)  {
		inputString=inputString.toLowerCase();
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		String[] words = inputString.split(" ");
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
			
		}
		//Extracting of all keys of word count
		Set<String> wordInString =wordCount.keySet();
		System.out.println("Ability to find frequency of words in a large\r\n"
				+ "paragraph phrase");
		for (String word : wordInString)  {
			if (wordCount.get(word)>1) {     // more than 1 counting
		//	System.out.println((word +"  :  "+wordCount.get(word)));
			}
			System.out.println((word +"  :  "+wordCount.get(word)));
		}	
	}
	public static void main(String [] args) {
		frequencyWord("Paranoids are not paranoid because they are "
				+ "paranoid but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations");
		
	}

}