package Pattern;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Prime numbers are"+i);
			}

		}
	}
}