package Pattern;

public class InheritanceUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop();
		
		l.printDetail("Laptop", 20000);
		
		Asus a = new Asus();
		a.printDetail("ASUS", 20);
		a.printAsusDetails("Grey");
		
		Dell d = new Dell();
		a.printDetail("Dell", 30);
		d.printDellDetails(500);
		
		//UpCasting
		Laptop lp = new Asus();
		lp.printDetail("ASUS", 50000);
		/*lp.name="ABC";
		lp.price=60000;*/
		
	}

}
class Laptop{
	
	String name;
	int price;
	
	void printDetail(String name, int price){
		this.name=name;
		this.price=price;
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
	}
}

class Asus extends Laptop{

	void printAsusDetails(String color){
		System.out.println("-------------");
		//super.printDetail(color, price);
		System.out.println("Color is: "+color);
	}
}

class Dell extends Laptop{
	
	void printDellDetails(int RAM){
		System.out.println("-------------");
		//super.printDetail(name, RAM);
		System.out.println("RAM is: "+RAM);
	}
}
