package Pattern;

public class staticBlock {
	public static void main(String args[]) {
		
		StudentInfo s1 = new StudentInfo();
	}
}

class StudentInfo {
	
	StudentInfo() {
		System.out.println("Constructor");
	}
	
	static String name;
	static {
		name = "Prital";
		System.out.println("Static block");
	}
	
	static{
		int rol_no=101;
		System.out.println(rol_no);
	}
}
