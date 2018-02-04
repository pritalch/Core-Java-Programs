package Pattern;

public class printG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				if (i == 0 || j == 0 || i == a) {
					System.out.print(" * ");
				} else if ((i == a / 2 && j > a / 2) || (j == a && i > a / 2))

				{
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				System.out.print("");

			}
			System.out.println();
		}
	}
}