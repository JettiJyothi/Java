package Task02;

import java.util.Scanner;

public class Task02_P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
        String str;
      
        int counter[] = new int[256];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=sc.nextLine();
        
         for (i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                  System.out.println("occurrence of the character " + (char) i  + " is :  " + counter[i] + " time");
            }
        }
        sc.close();
	}

}
