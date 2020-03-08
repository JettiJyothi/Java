package Task01;

import java.util.Scanner;

public class Task01_P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Given an array A of length N and a number K, find the greatest number in
		 * the array A that is smaller than K.   Input: arated integer N,(1=N=10^5)and 
		 * First line contains two space sep Q,(1=Q=10^5) number of elements in the
		 * array A, and number of queries.  Second line contains N space separated
		 * integers Ai,(1=Ai=10^9) elements of the array A.  Next Q lines contains one
		 * integer K,(1=K=10^9) each.  Output:  For each query, print the number of the
		 * greatest number in the array A that smaller than K.  SAMPLE INPUT   5 3  3 5
		 * 7 2 3  10  7  6  SAMPLE OUTPUT   7  5  5 
		 * 
		 * Explanation  The greatest number that is smaller than 10 is 7.  The greatest
		 * number that is smaller than 7 is 5.   The greatest number that is smaller
		 * than 6 is 5. 
		 * 
		 * 
		 */
		System.out.println("Input number of elements in the array (N), and number of queries(K) ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Input  array elements: ");

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			// System.out.println(" arr1[" + i + "]= " + arr1[i]);
		}
		int arrk[] = new int[k];
		for (int i = 0; i < k; i++) {
			System.out.println("Input querie" + i + "(K) = ");
			arrk[i] = sc.nextInt();
		}
		for (int i = 0; i < k; i++) {
			int max = 0;
			for (int j = 0; j < n; j++) {
				if (arr1[j] < arrk[i]) {
					if (arr1[j] > max) {
						max = arr1[j];
					}
				}
			}
			System.out.println("\nThe greatest number in the array A that is smaller than K =" + max);
		}
		sc.close();
		// int arr2[]=new int[size];
	}

}
