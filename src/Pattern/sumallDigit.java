package Pattern;

import java.util.Scanner;

public class sumallDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number");
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		int temp=0;
		for (int i = 0; i <= num; i++) {
			temp=temp+i;
		}
		System.out.println(temp);
	}

}
