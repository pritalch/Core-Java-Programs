package Pattern;

import java.util.Scanner;

public class fibonicii {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		int temp;
		for (int i = 2; i <= num; i++) {
			temp = n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
		}
		
	}
}
