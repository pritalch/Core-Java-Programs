package Pattern;

public class studConstructor {
	
	public static void main(String[] args) {
		StudentDetails st=new StudentDetails(1, "Prital");
		StudentDetails st1=new StudentDetails();
		st.display();
		st1.display();
	}

}
class StudentDetails{
	static int rno;
	static String name;
	static String address="Pune";
	
	StudentDetails(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	
	StudentDetails(){
	this.rno=100;	
	this.name="Asus";
	}
	
	static void display(){
		System.out.println(rno+","+name);
	}
}

