package Task05;

import java.util.Arrays;
import java.util.Scanner;

public class Task05_P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7. Write a java program to check whether one string is a rotation of another.
		// For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated
		// versions of this string are “StrutsHibernateJavaJ2ee”,
		// “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“ 

		System.out.println("Enter First input string : ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		System.out.println("Enter secind input string : ");
		String input2 = sc.next();
			char[] c1 = input1.toCharArray();
			char[] c2 = input2.toCharArray();
			Arrays.sort(c1);
			
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("input2 is rotated version of input1");
			} else {
				System.out.println("input2 is not rotated version of input1");
			}
		sc.close();
	}

}
