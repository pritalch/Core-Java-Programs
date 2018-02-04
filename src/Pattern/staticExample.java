package Pattern;

public class staticExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student.UpdateMark();
		//s1.college_Name="Pune University";
		s1.insert("Prital", 101);
		s2.insert("Asus", 102);
		s1.display();
		s2.display();	
	}

}

class Student {
	String Name;
	int Roll_No;
	static int mark=500;
	static String college_Name = "Indira";

	void insert(String Name, int Roll_No) {
		this.Name = Name;
		this.Roll_No = Roll_No;
	}
	
	static void UpdateMark(){
		mark=600;
	}
	
	void display() {
		System.out.println(Name + "," + Roll_No + "," + college_Name+","+mark);
	}
	
	
}
