package Pattern;

public class traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for (int i = num; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*for (int i = 1; i <=num; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
