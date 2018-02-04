package Pattern;

public class accountOperantion {

	public static void main(String[] args) {
		Account a = new Account(20);
		Account ac= new Account("Pune", 25);
		//ac.set(101, "ABC", 1000);
	}
}

class Account{
	
	int anum;
	String Name;
	float balance;

	Account(int sal) {
		System.out.println("Salary:"+sal);
	}
	
	Account(String address, int age){
		this(500);
		System.out.printf("Name is "+address+" and age is "+age);
		
	}
	
	void print(){
		System.out.println("My name is tester");
	}
	
	/*public void set(int anum, String Name, float balance){
		this.anum=anum;
		this.Name=Name;
		this.balance=balance;
	}

	
	String withdraw(){
		
		float amount = 0;
		if(balance<amount){
			System.out.println("Insufficent balance");
		}
		else {
			amount = balance+amount;
		}
		return anum + ":"+Name+ ":" +balance; 
	}*/
}