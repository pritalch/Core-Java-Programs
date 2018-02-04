package Pattern;

import java.util.Scanner;

public class demo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[3][3];

		System.out.println("Enter element for matrix 1");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		// Display Matrix 1
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Spiral Matrix is");
		for (int i = 0; i < mat1.length; i++) {
			System.out.print(mat1[0][i]);
		}

		for (int i = 1; i < mat1.length; i++) {
			System.out.print(mat1[i][2]);
		}

		for (int j = 1; j >= 0; j--) {
			System.out.print(mat1[2][j]);
		}

		for (int i = 0; i < mat1.length - 1; i++) {
			System.out.print(mat1[1][i]);
		}
	}
}
