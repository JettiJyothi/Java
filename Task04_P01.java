package Task04;

public class Task04_P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Write a Java Program to determine whether a given matrix is an identity matrix 
		int rows, cols;
		boolean flag = true;

		// Initialize matrix a
		int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		// Calculates the number of rows and columns present in the given matrix

		rows = a.length;
		cols = a[0].length;

		// Checks whether given matrix is a square matrix or not

		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			// Checks if diagonal elements are equal to 1 and rest of elements are 0
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}

			}
			if (flag) {
				System.out.println("given matrix is an identity matrix");
			} else {
				System.out.println("given matrix is not an identity matrix");

			}
		}

	}
}
