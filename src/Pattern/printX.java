package Pattern;

public class printX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for (int row = 0; row <= num; row++) {
			for (int col = 0; col <= num; col++) {
				if (col==row||row+col==num) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
