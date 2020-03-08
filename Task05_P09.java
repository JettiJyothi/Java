package Task05;

import java.util.Scanner;

public class Task05_P09 {
//9. If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n. 
	//Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. 
	//If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
	// One number will be missing in ‘a’ (2 in this case). You have to find out that missing number. 
	
	public static void main(String args[]) {
		
		System.out.println("Enter a positive number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//n=8
		int length=n-1;//l=7
		System.out.println("Enter array elements such that numbers should be <="+n+" and >0");
		int a[]=new int[length];
		for(int i=0;i<length;i++) {
			a[i]=sc.nextInt();
		}
		int miss = MissingNum(a, n);
		System.out.println("missing number="+miss);
		sc.close();
	}
	static int MissingNum(int a[], int num) {
		int i, total;
		int l=num-1;
		total = (num + 1) * (num) / 2;
		for (i = 0; i < l; i++)
			total -= a[i];
		return total;
	}
}