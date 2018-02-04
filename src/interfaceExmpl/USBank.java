package interfaceExmpl;

public interface USBank extends ASUBank {

	// In interface there is only decleration part
	String BankName="Reserve Bank";
	
	public void create();
	
	public void transfer();
	
	public static void main(String []args){
		USBank usb = new Demo();	//up casting--This is called dynamic polymorphism
		usb.create();
		usb.transfer();
		
		
	}
	
}

class Demo implements USBank {
	
	public void create(){
		System.out.println("Create method");
	}
	
	public void transfer(){
		System.out.println("Transfer method");
	}
	
	public void homeLoan(){
		System.out.println("Home loan method");
	}
	
	public void sum(){
		System.out.println("Sum");
	}
	
	public void sum(int x){
		System.out.println(x);
	}
	
	/*public static void main(String []args){
		USBank usb = new Demo();	//up casting--This is called dynamic polymorphism
		usb.create();
		usb.transfer();
	}*/
}