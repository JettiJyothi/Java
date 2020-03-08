package Task05;

import java.util.Scanner;

public class Task05_P02 {

//2. Write a Java program to find second largest number in an integer array 

	public static void main(String[] args) {

		System.out.println("Enter length of array : ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int secondmax = arr[0];
		System.out.println(" given array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		System.out.println("\nSecond largest number is:" + secondmax);
		sc.close();
	}
}