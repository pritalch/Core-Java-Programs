package Pattern;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = 1;
		for (int i = 1; i <=num; i++) {
			temp=temp*i;
		}
		System.out.println("Factorial is");
		System.out.println(temp);
	}

}
