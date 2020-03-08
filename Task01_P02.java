package Task01;

import java.util.Scanner;

public class Task01_P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Write a java program to reverse an array 
		System.out.println("Input array length: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Input a array elements: ");

		for (int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
			System.out.println(" arr1[" + i + "]= " + arr1[i]);
		}

		int t;
		System.out.print("After Reversing array: \n");
		int j = size - 1;
		for (int i = 0; i < j; i++) {
			t = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = t;
			j--;
		}
		for (int i = 0; i < size; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i] + "  ");
		}

		sc.close();
	}
}
