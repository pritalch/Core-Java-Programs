package Pattern;

public class demoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w = new Watch("Silver", "Titne", 5000);

		
		// Watch w = new Watch();
		w.printWatchDetails();

		Analog an = new Analog("Black", "Fast Track", 3000, true);
		an.printAnalogDetails();
	}
}

class Watch {
	String color;
	String brand;
	int price;
	static String manifacturing="INDIA";
	
	Watch(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	Watch() {
		this("abc", "pqr", 10);

	}

	void printWatchDetails() {
		showmanfact();
		System.out.println("color: " + color + ", Brand: " + brand + ", Price: " + price);
	}
	
	static void showmanfact(){
		System.out.println(manifacturing);
	}
	
	static void showmanfact(String name){
		System.out.println(name);
	}
}

class Analog extends Watch {
	boolean wrist;

	Analog(String color, String brand, int price, boolean wrist) {
		super(color, brand, price);
	}

	void printAnalogDetails() {
		printWatchDetails();
		System.out.println("Is wrist watch: " + true);
	}
}