package Pattern;

import java.util.Scanner;

public class numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[new Scanner(System.in).nextInt()];
		for (int i = 1; i <= number.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
