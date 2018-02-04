package Pattern;

public class sampleExample {

	public static void main(String[] args) {
		CheckOperation co = new CheckOperation(6);
		System.out.println(co.iseven());
		System.out.println(co.square());
		System.out.println(CheckOperation.multiplication(5, 5));
		
		CheckOperation co1 = new CheckOperation(8);
		System.out.println(co1.iseven());
		System.out.println(co1.square());
	}

}

class CheckOperation {
	int num;

	CheckOperation(int num) {
		this.num = num;
	}

	int square() {
		return num*num;
	}

	boolean iseven() {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	static long multiplication(int num1,int num2){
		return num1*num2;
	}
}