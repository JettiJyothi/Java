package Task05;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_P08 {
	// 8. Write a java program to separate zeros from non-zeros in the given array.
	// You have to move zeros either to end of the array or bring them to beginning
	// of the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then
	// moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and
	// bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}. 

	public static void main(String[] args) {
		System.out.println("Enter length of array: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println("Enter array elements :");
		int a[] = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = sc.nextInt();
		}
		moveZerosToEnd(a);
		sc.close();
	}

	static void moveZerosToEnd(int inputArray[]) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[count] = inputArray[i];
				count++;
			}
		}
		while (count < inputArray.length) {
			inputArray[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

}
