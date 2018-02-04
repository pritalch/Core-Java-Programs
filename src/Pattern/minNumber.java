package Pattern;

import java.util.Scanner;

public class minNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many number you want to enter");
		int[] number = new int[new Scanner(System.in).nextInt()];
		System.out.println("Enter numbers");
		for (int i = 0; i < number.length; i++) {
			number[i] = new Scanner(System.in).nextInt();
		}
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.println(min);
	}
}
