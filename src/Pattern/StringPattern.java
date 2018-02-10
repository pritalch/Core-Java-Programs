package Pattern;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "prital";
		int num = st.length();
		/*for (char i = 0; i < st.length(); i++) {
			for (char j = 0; j <= i; j++) {
				System.out.print(st.charAt(j));
			}
			System.out.println("");
		}*/
		
		for (int i =num-1; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(st.charAt(j));
			}
			System.out.println("");
		}

	}

}
