package Pattern;

import java.util.Scanner;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter elements for matrix");
		Scanner sc = new Scanner(System.in);
		int mat1[][] = new int[3][3];

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix is");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Spiral is");
		for (int i = 0; i < mat1.length; i++) {
			System.out.print(mat1[0][i]);
		}
		
		for (int j = 1; j < mat1.length; j++) {
			System.out.print(mat1[j][2]);
		}
		
		for (int i = 1; i >= 0; i--) {
			System.out.print(mat1[2][i]);
		}
		
		for (int i = 0; i < mat1.length-1; i++) {
			System.out.print(mat1[1][i]);
		}
		
	}
}
