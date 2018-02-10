package Pattern;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleElement {

	public static void main(String[] args) {

		System.out.println("Enter count");
		int num[] = new int[new Scanner(System.in).nextInt()];

		System.out.println("Enter Elements");
		for (int i = 0; i < num.length; i++) {
			num[i] = new Scanner(System.in).nextInt();

		}
		/*
		 * for (int i = 0; i < num.length; i++) { 
		 Random rs = new Random();
		 int j = rs.nextInt(i-1); 
		 swap(num, i, j);
		 }
		 */

		// Print Random numbers

		RandomArray(num);
		System.out.println(Arrays.toString(num));
	}

	// swap function
	public static void swap(int num[], int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

	// Random element

	public static int[] RandomArray(int[] ele) {
		for (int i = 0; i < ele.length; i++) {
			Random ra = new Random();
			int randomposition = ra.nextInt(ele.length+1);
			swap(ele, i, randomposition);
		}
		return ele;
	}

}
