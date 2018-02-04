package Pattern;

public class classExample {

	public static void main(String[] args) {
		laptop asus = new laptop();
		laptop lenovo = asus; // object creation by reference variable
		asus.set(1024, true);
		System.out.println(asus.get());
		System.out.println(lenovo.get()); // shows same value as asus

	}
}

class laptop {

	int ram;
	Boolean keyboard;

	public void set(int ram, Boolean keyboard) {
		this.ram = ram;
		this.keyboard = keyboard;
	}

	public String get() {
		return ram + ":" + keyboard;
	}
}
