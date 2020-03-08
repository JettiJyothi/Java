package Task05;

import java.util.HashMap;
import java.util.Scanner;

public class Task05_P03 {

	// 3. Write a java program to count the number of occurrences of each
	// character in a given string. For example, If “Java J2EE Java JSP J2EE” is the
	// given string then occurrences of each character in this string is E=4, 2=2,
	// v=2,  =4, P=1, S=1, a=4, J=5 
	private static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(inputString + " : " + charCountMap);
	}

	public static void main(String[] args) {
		System.out.println("Eg:");
		characterCount("Java J2EE Java JSP J2EE");
		System.out.println("Give your Input :");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		characterCount(input);
		sc.close();
	}

}
