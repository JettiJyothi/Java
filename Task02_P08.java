package Task02;

import java.util.Arrays;

public class Task02_P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//8. Write a Java Program to Concatenate Two Arrays 
		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
		int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
		int firstArraylength = firstArray.length;       
		int secondArraylength = secondArray.length;  
		int[] result = new int[firstArraylength + secondArraylength];  
		System.arraycopy(firstArray, 0, result, 0, firstArraylength);  
		System.arraycopy(secondArray, 0, result, firstArraylength, secondArraylength);  
		System.out.println(Arrays.toString(result));    

	}

}
