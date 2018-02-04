package Pattern;

public class printR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (i == 0 || i == (a / 2) || j == 0 || (i > a / 2 - 1 && j == (i - 2) + 1) || (j == a && i == a)) {
					System.out.print(" * ");
				} else {
					if (j == a && i < a / 2) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}

					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
