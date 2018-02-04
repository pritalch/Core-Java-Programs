package Pattern;

import java.util.Scanner;

public class whiletable {

	public static void main(String[] args) {
		System.out.println("Enter number");
		printTable(new Scanner(System.in).nextInt());
		// TODO Auto-generated method stub
		
	}

	private static void printTable(int nextInt) {
		// TODO Auto-generated method stub
		
		/*int i=1;
		while(i<11){
			System.out.println(nextInt + "*" + i + "=" + (nextInt*i));
			i++;
		}*/
		
		int i=2;
		while(i<nextInt/2){
			if(nextInt%i==0){
				System.out.println("Not Prime");
				break;
			}
			i++;
		}
	
		if (i==nextInt/2) {
			System.out.println("Prime");
		}
	}

}
