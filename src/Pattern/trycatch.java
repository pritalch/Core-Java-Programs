package Pattern;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int number;
		try{
			number = new Scanner(System.in).nextInt();
			number=number/0;
			System.out.println("Exception Occer");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("In math exception");
		}
		System.out.println("Number is");
		System.out.println("Number is");
		
		
	}

}
