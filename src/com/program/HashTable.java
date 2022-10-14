package com.program;

import java.util.HashMap;

public class HashTable {

	public static void frequencyWord(String inputString)  {
		inputString=inputString.toLowerCase();
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		String[] words = inputString.split(" ");

		for (int i=0; i< words.length;i++) {
			if (wordCount.containsKey(words[i]))  {  //  this line is repeatation of word is detect
				int count=wordCount.get(words[i]);  // no. of count words
				wordCount.put(words[i],count +1);   // it will add the word number like 1 to upgrade in 2
			}
			else  {
				wordCount.put(words[i], 1);  // add the word in number
			}
		}
		System.out.println(wordCount);
	}	 

	public static void main(String [] args) {
		System.out.println("Welcome To HashMap & Binary Tree Program");
		frequencyWord("To be or not to be ");
	}
}
