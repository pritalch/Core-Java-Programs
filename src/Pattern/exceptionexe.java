package Pattern;

public class exceptionexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[15];

		for (int i = 0; i < 21; i++) {
			try {
				System.out.println("Inserting" + i);
				arr[i] = i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("In catch array out of bound");
			}catch (NumberFormatException e) {
				System.out.println("In catch number format");
			}catch (NullPointerException e) {
			e.printStackTrace(); 
			
			}
		}
		System.out.println("Done");
	}

}
