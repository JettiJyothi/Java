package Task04;

public class Task04_P09 {
	// 9. Write a Java Program to find the longest repeating sequence in a string 
	public static void main(String[] args) {
		String str = "acbdfhbdf";
		String lrs = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// the largest common factors in every substring
				String x = longestRepeatingSequence(str.substring(i, n), str.substring(j, n));
				if (x.length() > lrs.length())
					lrs = x;
			}
		}
		System.out.println("Longest repeating sequence is : " + lrs);

	}
	public static String longestRepeatingSequence(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

}
