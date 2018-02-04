package Pattern;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to choose case");
		int num = sc.nextInt();

		System.out.println("Enter 1st number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int n2 = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Addition is: "+(n1+n2));
			break;
		case 2:
			System.out.println("Substraction is: "+(n1-n2));
			break;
			
		case 3:
			System.out.println("Multiplication is: "+(n1*n2));
			break;

		case 4:
			System.out.println("Division is: "+(n1*n2));
			break;
			
		default:
			System.out.println("No case match");
			break;
		}
	}

}
