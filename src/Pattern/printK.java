package Pattern;

public class printK {

	public static void main(String[] args) {

		int num = 5;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col == 1 || (col==2 && row ==3)||(col==3 && row ==2)||(col==4 && row==1)
				 ||(col==1 && row ==3)||(col==3 && row ==4)||(col==4 && row==5)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}