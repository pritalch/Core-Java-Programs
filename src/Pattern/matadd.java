package Pattern;

import java.util.Scanner;

public class matadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int result[][]=new int[3][3];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
		
		/*for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j]);
			}
			System.out.println("");
		}
		
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat2[i][j]);
			}
			System.out.println("");
		}*/
	}

}
