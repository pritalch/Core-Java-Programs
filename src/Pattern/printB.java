package Pattern;

public class printB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int pat = num/2;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 1 || row == pat || col == 1 || col == num || row==6) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
