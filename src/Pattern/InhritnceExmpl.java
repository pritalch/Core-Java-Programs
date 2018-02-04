package Pattern;

public class InhritnceExmpl {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.print();
		
		//up casting--This is called dynamic polymorphism
		Book b1 = new Story();
		b1.print(); 
		
		//down casting--- This is not allowed
		/*Story s1 = (Story) new Book();
		s1.print();
		s1.price();*/
		
		Story.Book_Name="Changed Name";
		System.out.println(Story.Book_Name);
	}

}
class Book{
	
	void print(){
		System.out.println("Book print method");
	}
}

class Story extends Book{
	static String Book_Name="Rich dad poor dad";
	void price(){
		System.out.println(Book_Name);
	}
}