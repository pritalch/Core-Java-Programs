package Pattern;

public class Final {

	public static void main(String[] args) {
		
		final int x=10;
		// x=20; // we can not change final veriable
	}

}

// if we make any class as a final then we can not extend that class
//final class A{
class A{
	
	// if we make any method as a final then we can not override it in another class
	//public final void start(){
	public void start(){
		System.out.println("Class A Method");
	}

}

class B extends A{
	public void start(){
		System.out.println("Class B method");
	}
}
