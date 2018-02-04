package Pattern;

public class printP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {

				if(row==1||col==1||row==num/2||(col==num&&row<num/2)){
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	
	}
}
