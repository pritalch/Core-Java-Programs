package Pattern;

public class printQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {

				if ((i == 0 && j < a - 2) || (i == a - 1 && j < a - 2) || (j == 0 && i < a - 1)
						|| (i > a / 2 - 2 && j == (i - 2) + 1) || (j == a / 2 && i < a - 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
