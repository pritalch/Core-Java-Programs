package Pattern;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;	
		}
		System.out.println(+rev);
		
		if(num==num){
			System.out.println("Number is palindrom");
		}else {
			System.out.println("Number is not palindrom");
		}
		}

}
