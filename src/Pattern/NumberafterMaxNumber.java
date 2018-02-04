package Pattern;

import java.util.Scanner;

public class NumberafterMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to enter");
		int[] number = new int[new Scanner(System.in).nextInt()];
		System.out.println("Enter number");
		for (int i = 0; i < number.length; i++) {
			number[i] = new Scanner(System.in).nextInt();
		}
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (max == number[i]) {
				System.out.println("Number is: "+ number[i + 1]);
			}
		}
	}
}
