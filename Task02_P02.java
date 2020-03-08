package Task02;

public class Task02_P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Write a Java Program to Multiply to Matrix Using Multi-dimensional Arrays 
		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  
		//multiplying and printing multiplication of 2 matrices    
		System.out.println("multiplication of 2 matrices:\n");
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}
		//printing matrix element  
		System.out.print(c[i][j]+" ");  
		}
		System.out.println();    
		}    
	}

}
