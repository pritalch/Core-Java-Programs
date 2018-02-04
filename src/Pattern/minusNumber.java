package Pattern;

import java.util.Scanner;

public class minusNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[new Scanner(System.in).nextInt()];
		for (int i = 0; i < number.length; i++) {

			number[i] = new Scanner(System.in).nextInt();

		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				number[i] = 0;
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
