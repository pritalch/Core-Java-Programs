package Pattern;

import java.util.Scanner;

public class matrixOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[3][3];
		int mat2[][] = new int[3][3];
		int result[][] = new int[3][3];

		System.out.println("Enter element for matrix 1");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		// Display Matrix 1
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}

		/*System.out.println("Enter element for matrix 2");
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}

		// Display Matrix 2
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				System.out.print(mat2[i][j]);
			}
			System.out.println();
		}*/

		// Addition or Substraction
		/*for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				// System.out.print(mat1[i][j]+mat2[i][j]);
				// System.out.print(mat1[i][j]-mat2[i][j]);
			}
			System.out.println();
		}*/

		// Multiplication
		/*for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				for (int k = 0; k < mat2.length; k++) {
					result[i][j] = result[i][j] + mat1[i][k] * mat2[k][j];
				}
				System.out.print(result[i][j]);
			}
			System.out.println();
		}*/
		
		//Transpose
		System.out.println("Transpose of matrix is");
		for (int i = 0; i < mat1.length; i++) {
			System.out.println(mat1[0][i]+" "+mat1[1][i]+" "+mat1[2][i]);
		}
	}

}
