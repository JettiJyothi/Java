package Task05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Task05_P01 {

//1. Write a java program to find duplicate characters and their count in a given string. For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2 
	public static void main(String[] args) {

		System.out.println("Eg:");
		duplicateCharCount("Better Butter");
		System.out.println("Give your Input :");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		duplicateCharCount(input);
		sc.close();
	}

	static void duplicateCharCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// Converting given string to char array
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		Set<Character> charsInString = charCountMap.keySet();

		System.out.println("Duplicate Characters In " + inputString);
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}

	
}
