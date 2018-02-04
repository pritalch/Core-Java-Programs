package Pattern;

import java.util.Scanner;

public class matMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[2][2];
		int mat2[][] = new int[2][2];
		int result[][] = new int[2][2];

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2.length; j++) {
				for (int k = 0; k < mat2.length; k++) {
					result[i][j] = result[i][j] + mat1[i][k] * mat2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
			sc.close();
		}
	}
}
