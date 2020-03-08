package Task05;

import java.util.Arrays;

public class Task05_P05 {
//5. Write a java program to find continuous sub array of the given array whose sum is equal to a given number. For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find continuous sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements add up to 45 
	static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = inputArray[0];
		int start = 0;
		for (int i = 1; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			while (sum > inputNumber && start <= i - 1) {
				sum = sum - inputArray[start];
				start++;
			}
			if (sum == inputNumber) {
				System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is "+ inputNumber + " : ");
				for (int j = start; j <= i; j++) {
					System.out.print(inputArray[j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		findSubArray(new int[] { 4, 1, 1, 8, 6, 3 }, 2);
		findSubArray(new int[] { 2, 5, 3, 1, 1, 8 }, 9);
		findSubArray(new int[] { 1, 4, 7, 8, 5, 1, 2 }, 4);
	}
}