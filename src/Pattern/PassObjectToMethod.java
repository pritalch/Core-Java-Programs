package Pattern;

import java.util.Date;

public class PassObjectToMethod {

	public static void main(String[] args) {

		MethodObject m = new MethodObject();
		printop(m);

	}

	private static void printop(MethodObject m) {
		print.printop("" + m.printoperation);

	}

}

class MethodObject {
	public String printoperation;
	
	void printoperation() {
		System.out.println("Method Object");
	}
}

class print {

	public static void printop(String string) {
		System.out.println(new Date() +""
				);

	}

}