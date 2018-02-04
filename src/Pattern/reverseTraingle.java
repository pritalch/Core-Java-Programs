package Pattern;

import java.util.Scanner;

public class reverseTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[new Scanner(System.in).nextInt()];
		for (int i = number.length-1; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
