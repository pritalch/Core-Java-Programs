package Pattern;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.println("Number is even" + i);
			} else {
				System.out.println("Number is odd" + i);
			}
		}
	}

}
