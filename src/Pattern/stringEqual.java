package Pattern;

import java.util.Scanner;

public class stringEqual {

	public static void main(String[] args) {
		
		System.out.println("Enter two string");
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		
		
		if(s1.equals(s2)){
			System.out.println("Strings are euqal");
		}else {
			System.out.println("Not equal");
		}
		sc.close();
	}

}
