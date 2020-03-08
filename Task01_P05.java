package Task01;

import java.util.Scanner;

public class Task01_P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Given a positive integer N. The task is to check if N is a power of 2.
		 * That is N is 2x for some x.  Input:  The first line contains T denoting the
		 * number of test cases. Each test case contains a single positive integer N. 
		 * Output:  Print "YES" if it is a power of 2 else "NO" (Without the double
		 * quotes).  Constraints:  1 <= T <= 100  0 <= N <= 1018  Example:  Input :  2 
		 * 1  98  Output :  YES  NO  Explanation:  Testcase 1:  1 is equal to 2 raised
		 * to 0 (20 == 1). 
		 */

		System.out.println("Input number of test cases");
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		if((TC<0)||(TC>100)) {
			System.out.println("expected Value is 0 <= T <= 100");
		}
		for (int i = 1; i <= TC; i++) {
			System.out.println("TC" + i + "-positive integer N: ");
			int n = sc.nextInt();
			if((n<0)||(n>1018)) {
				System.out.println("expected Value is 0 <= N <= 1018");
				break;
			}
			while (n % 2 == 0) {
				n /= 2;
			}
			if (n == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}
