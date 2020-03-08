package Task01;

import java.util.Scanner;

public class Task01_P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Swap given two numbers and print them. (Try to do it without a temporary
		 * variable.)  Input:  First line contains an integer, the number of test cases
		 * 'T'. Each test case should contain two positive numbers a and b. 
		 * 
		 * Output:  Print the 2 numbers after swapping. 
		 * 
		 * Constraints:   1 <= T <= 100  1 <= a <= 106  1 <= b <= 106 
		 * 
		 * Example:  Input:  2  20 30  12 32  Output:  30 20  32 12 
		 * 
		 */
		System.out.println("Input number of test cases:");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if((t<1)||(t>100)){
			System.out.println("expected Value is 0 <= T <= 100");
		}
		for (int i = 1; i <= t; i++) {
			System.out.println("Input TC" + i + "data");
			System.out.println("Input a: ");
			int a = sc.nextInt();
			if((a<1)||(a>100000)){
				System.out.println("expected Value is 0 <= a <= 1000000");
			}
			System.out.println("Input b: ");
			int b = sc.nextInt();
			if((b<1)||(b>100000)){
				System.out.println("expected Value is 0 <= a <= 1000000");
			}
			// Code to swap 'a' and 'b'
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("After swap: \nx=" + a + "\ny=" + b + "\n----\n");
		}
		sc.close();
	}

}
