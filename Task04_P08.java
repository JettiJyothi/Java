package Task04;

import java.util.Scanner;

public class Task04_P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//8. Write a Java Program to find the transpose of a given matrix 
		int i, j;  
	    System.out.println("Enter total rows and columns: ");  
	    Scanner sc = new Scanner(System.in);  
	    int row = sc.nextInt();  
	    int column = sc.nextInt();  
	    int array[][] = new int[row][column];  
	    System.out.println("Enter matrix:");  
	    for(i = 0; i < row; i++)  
	    {  	    	
	        for(j = 0; j < column; j++)   
	            {  
	            array[i][j] = sc.nextInt();  
	            System.out.print(" ");  
	            }  
	    }  
	    System.out.println("The above matrix before Transpose is ");  
	    for(i = 0; i < row; i++)  
	        {  
	            for(j = 0; j < column; j++)  
	            {  
	            System.out.print(array[i][j]+" ");  
	            }  
	            System.out.println(" ");  
	        }  
	    System.out.println("The above matrix after Transpose is ");  
	    for(i = 0; i < column; i++)  
	        {  
	            for(j = 0; j < row; j++)  
	            {  
	                System.out.print(array[j][i]+" ");  
	            }  
	            System.out.println(" ");  
	        }
	    sc.close();
	}

}
