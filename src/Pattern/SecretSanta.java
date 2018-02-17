package Pattern;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecretSanta {

	public static void main(String[] args) {

		// Enter count
		System.out.println("Enter count");
		String name[] = new String[new Scanner(System.in).nextInt()];
		// Accept array element
		System.out.println("Enter Elements");
		for (int i = 0; i < name.length; i++) {
			name[i] = new Scanner(System.in).next();

		}

		String copy[] = new String[name.length];
		for (int i = 0; i < name.length; i++) {
			copy[i] = name[i];
		}

		for (int i = 0; i < RandomArray(copy).length; i++) {
			//RandomArray(copy);
			int person = 0;

			if (name[person].equals(copy[i])) {
				person++;
			}
			System.out.println("Santa for " + name[i]+ " is ->" + copy[person]);
		}
	}

	// Random element
	public static String[] RandomArray(String[] ele) {
		for (int i = 0; i < ele.length; i++) {
			Random ra = new Random();
			int randomposition = ra.nextInt(ele.length-1);
			String temp = ele[i];
			ele[i] = ele[randomposition];
			ele[randomposition] = temp;
		}
		return ele;
	}
}
