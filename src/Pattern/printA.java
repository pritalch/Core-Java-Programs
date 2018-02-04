package Pattern;

public class printA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int pat = num/2;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (row == 1 || row == pat || col == 1 || col == num) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
