package interfaceExmpl;

public class Drawble implements InterfaceExmpl {

	public static void main(String[] args) {
		
		Drawble d = new Drawble();
		d.draw();
		
		Rectangle r = new Rectangle();
		r.rectangle(10);
		
		circle c = new circle();
		c.cir(6);
		
		traingle tr = new traingle();
		tr.getDetails();
	}

	@Override
	public void draw() {
	}

}

class Rectangle implements InterfaceExmpl{

	@Override
	public void draw() {
		System.out.println("This is interface method");
	}
	
	void rectangle(int hight){

		int res= hight*hight;
		System.out.println("Hight of rectangle"+res);
	}
}

class circle implements InterfaceExmpl{

	@Override
	public void draw() {
	}
	
	void cir(int area){
		int res= area*3;
		System.out.println("area of circle"+res);
	}
	
}

// class implements interface
class traingle implements InterfaceExmpl{

	@Override
	public void draw() {
	}
	
	void getDetails(){
		System.out.println("Traingle method");
	}
	
}

