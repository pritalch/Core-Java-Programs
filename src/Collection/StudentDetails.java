package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> indira = new ArrayList<>();
		
		indira.add(new Student(101, "Prital", 25));
		indira.add(new Student(102, "Asus", 30));
		
		printDetails(indira);
	}

	
	public static void printDetails(ArrayList<Student> std){
		Student s;
		for (int i = 0; i < std.size(); i++) {
			s=std.get(i);
			System.out.println("Rollno is:"+s.Rollno);
			System.out.println("Name is:"+s.name);
			System.out.println("Age is: "+s.Age);
			System.out.println("------------------"
					+ "");
		}
		
		//OR
		/*Iterator it = std.iterator();
		
		while(it.hasNext()){
			String st = (String)it.next();
			System.out.println(st);
		}*/
	}
}
class Student{
	
	int Rollno;
	String name;
	int Age;
	
	public Student(int Rollno, String name, int Age) {
		this.Rollno=Rollno;
		this.name=name;
		this.Age=Age;
	}
	
}