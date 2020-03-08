package Task01;

import java.util.Scanner;

public class Task01_P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Write a java program to reverse a string 
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a string: ");
		String input=sc.nextLine();
		System.out.println("Reverse string: ");
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}
		sc.close();
	}

}
