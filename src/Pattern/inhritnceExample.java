
package Pattern;

public class inhritnceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car("Red", 10000);
		cr.print();

		breza bz = new breza("Blue", 20000, 150, true, 5);
		bz.printDetails();
	}

}

class Car {
	String color;
	int price;
	int seating;

	void setDetails(String color, int price) {
		this.color = color;
		this.price = price;
	}

	void print() {
		System.out.println(color + ":" + price);
	}

	Car(String color, int price) {
		this.color = color;
		this.price = price;
	}

	Car(int seating) {
		this.seating = seating;
	}

}

class breza extends Car {
	int maxrpm;
	boolean abs;

	breza(String color, int price,int maxrpm, boolean abs,int seating) {
		super(color, price);
		this.abs=abs;
		this.maxrpm=maxrpm;
		
	}

	breza(int seating) {
		super(seating);
	}
	
	void printDetails() {
		System.out.println(color + ":" + price + ":" + maxrpm + ":" + abs + ":" + seating);
	}
}