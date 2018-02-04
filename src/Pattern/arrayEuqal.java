package Pattern;

import java.util.Arrays;
import java.util.Scanner;

public class arrayEuqal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1=new int[10];
		int[] a2=new int[10];
		
		System.out.println("Enter element for a1");
		for (int i = 0; i < a1.length; i++) {
			a1[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("Enter element for a2");
		for (int i = 0; i < a2.length; i++) {
			a2[i]=new Scanner(System.in).nextInt();
		}
		
		if(Arrays.equals(a1, a2)){
			System.out.println("Same element");
		}else {
			System.out.println("Different");
		}
		
	}

}
