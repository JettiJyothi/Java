package Task05;

import java.util.HashMap;
import java.util.Scanner;

public class Task05_P10 {
//10. Given a string, your code must find out the first repeated as well as non-repeated character in that string. For example, if “JavaConceptOfTheDay” is the given string, then ‘J’ is a first non-repeated character and ‘a’ is a first repeated character 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string :");
		String input = sc.next();
		firstRepeatAndNonRepeatChar(input);
		sc.close();
	}
	
	static void firstRepeatAndNonRepeatChar(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// code for first non-repeated character

		for (char c : strArray) {
			if (charCountMap.get(c) == 1) {
				System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'");

				break;
			}
		}

		// code for first repeated character

		for (char c : strArray) {
			if (charCountMap.get(c) > 1) {
				System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'");

				break;
			} else {
				System.out.println("There is no Repeated Character in '" + inputString + "'");
				break;
			}
		}
	}

	
}
