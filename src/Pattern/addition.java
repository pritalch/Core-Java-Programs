package Pattern;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num = sc.nextInt();

		int a = 0;
		for (int i = 0; i <= num; i++) {
			a = a + i;
		}
		System.out.println("Addition is");
		System.out.println(a);
	}

}
