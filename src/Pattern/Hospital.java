package Pattern;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor dr = new Doctor("Dr.ABC", "MBBS");
		dr.print();
		
		Surgen sr = new Surgen("Dr.PQR", "MBBS.MD", "Bone");
		sr.printSurDetails();
		
		
		HeartSug hs = new HeartSug("Dr.RTY", "MD MBBS", "Heart Surgen", 25);
		hs.printHeratSurDetails();
		
		Nurse nr = new Nurse("New Nurse", "B.Sc", "NA", 20, "Part Time");
		nr.printDocName();
		
		BoneSurgen bs = new BoneSurgen("Dr.WXZ", "MD MBBS1", "Bone Surgen", "Mumbai");
		bs.printBoneSurDetails();
		
		Physi ph = new Physi("Dr.XYZ", "MD", "Pune");
		ph.printPhyDetails();
	
	}

}

class Doctor {
	String Name;
	String Qualification;

	Doctor(String Name, String Qualification) {
		this.Name = Name;
		this.Qualification = Qualification;
	}

	void print() {
		System.out.println(Name + ":" + Qualification);
	}
	
	protected void printDocName(){
		System.out.println(Name);
	}

}

class Surgen extends Doctor {
	String Type;

	Surgen(String Name, String Qualification, String Type) {
		super(Name, Qualification);
		this.Type = Type;
	}
	
	void printSurDetails() {
		System.out.println("----------------");
		System.out.println("Surgen Details");
		print();
		printDocName();// Protected base class method accessible in child class
		System.out.println(Type);
	}
}
class HeartSug extends Surgen{
	int Age;
	HeartSug(String Name, String Qualification, String Type, int Age) {
		super(Name, Qualification, Type);
		this.Age=Age;
	}
	void printHeratSurDetails() {
		System.out.println("----------------");
		System.out.println("Heart Surgen Details");
		print();
		printDocName();// Protected base class method accessible in child of child class
		System.out.println(Age);
	}

}

class Nurse extends HeartSug{
	String NurseType;
	Nurse(String Name, String Qualification, String Type, int Age, String NurseType) {
		super(Name, Qualification, Type, Age);
		this.NurseType=NurseType;
	}

	void printHeratSurDetails() {
		System.out.println("----------------");
		System.out.println("Heart Surgen Details");
		print();
		printDocName();// Protected base class method accessible in child of child class
		System.out.println(Age);
	}
}

class BoneSurgen extends Surgen{
	String Address;
	BoneSurgen(String Name, String Qualification, String Type, String Address) {
		super(Name, Qualification, Type);
		this.Address=Address;
	}
	void printBoneSurDetails() {
		System.out.println("----------------");
		System.out.println("Bone Surgen Details");
		print();
		printDocName();// Protected base class method accessible in child of child class
		System.out.println(Address);
	}
}
class Physi extends Doctor {
	String Address;

	Physi(String Name, String Qualification, String Address) {
		super(Name, Qualification);
		this.Address = Address;
	}

	void printPhyDetails() {
		System.out.println("----------------");
		System.out.println("Physi Details");
		print();
		printDocName();// Protected base class method accessible in child class
		System.out.println(Address);
	}
}