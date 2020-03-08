package Task05;

public class Task05_P06 {
//6. Write a java program to check whether given number is binary or not. A binary number is a number which contains only 0 or 1. For example : 101101, 110010110, 10010011 are binary numbers 
	public static void main(String[] args) {
		isBinary(1234);
		isBinary(1010);
		isBinary(1029);
		isBinary((2014));
	}

	static void isBinary(int number) {
		boolean isBinary = true;
		int num = number;
		while (num != 0) {
			int temp = num % 10;
			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				num = num / 10; //
			}
		}
		if (isBinary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}
	}
}
