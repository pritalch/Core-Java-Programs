package Pattern;

public class printN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for (int row = 1; row <=num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col==1||row==col||col==num) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
