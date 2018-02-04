package Pattern;

public class whileA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		int i=1;
		while(i<=num){
			if(i==0){
				System.out.print("*");
			}else {
				System.out.print("");
			}
			i++;
		}
	}

}
/*for (int row = 1; row <= num; row++) {
	for (int col = 1; col <= num; col++) {
		if (row == 1 || row == pat || col == 1 || col == num) {
			System.out.print(" * ");
		} else {
			System.out.print("   ");
		}
	}
	System.out.println();
}*/