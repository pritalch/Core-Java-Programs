package Pattern;

import java.util.Scanner;

public class reversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int[10];
		System.out.println("Entre numbers");
		for (int i = 0; i < num.length; i++) {
			num[i] = new Scanner(System.in).nextInt();
		}
		
		System.out.println("Reverese numbers");
		for (int i = num.length-1; i >=0; i--) {
			System.out.println(num[i]);
		}
	}

}
