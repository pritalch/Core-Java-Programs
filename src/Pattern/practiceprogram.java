package Pattern;

public class practiceprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		
		/*for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(i==0||j==num/2){
					System.out.print(" * ");
				}else if(j<num/2&&i==num || j==0&&i>num/2){
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}	
				}
			System.out.println("   ");
		}*/
		
		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <=num; j++) {
				if(j==0||j==num){
					System.out.print(" * ");
				}else if( j< num / 2 && i==j) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}

}
