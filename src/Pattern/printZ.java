package Pattern;

public class printZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for (int row = num; row >=1; row--) {
			for (int col = 1; col <= num; col++) {
				
				if (row == 1 || row == num || col == row) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
