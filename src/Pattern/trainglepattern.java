package Pattern;

public class trainglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		for (int row = num; row >=1; row--) {
			for (int col = 1; col <=row; col++) {
				if (row == num || col == 1 || col == row) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}

}
