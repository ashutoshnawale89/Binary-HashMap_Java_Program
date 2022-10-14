package com.program;

import java.util.HashMap;
import java.util.Set;

public class HashTable {

	public static void remove(String str, String word)  {
		// split the string using split() method
		String msg[] = str.split(" ");
		String new_str = " ";
		//  Iterating the string using for each loop
		for (String words : msg)  {
			// If desired word is found
			if (!words.equals(word)) {
				
				// concat the word not equal to the given
				// word
				new_str += words + " ";
			}
		}
		// print the new String
		System.out.println(new_str);
	}
	// method 2
	// main driver method
	public static void main(String[] args)  {
		// custom string as input
		String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations  ";
		
		// word to be removed from above string 
		String word = "avoidable";
		
		// calling the method 1 by passing both strings to it
		remove(str,word);
	}
	
}
