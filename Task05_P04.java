package Task05;

public class Task05_P04 {
//4. Write a java program to find all pairs of elements in the given array whose sum is equal to a given number. For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20 

	static void findThePairs(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}
	}

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -1, 8, 5, 2 }, 10);
		findThePairs(new int[] { 4, -5, 9, 1, 2, 4, 12, 8 }, 20);
		findThePairs(new int[] { 12, 13, 14, 15, 16, 10, -15 }, 25);
		findThePairs(new int[] { 1, 39, 100, 41, -100, 40, 18, 8 }, 40);
	}
}
