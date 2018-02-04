package Pattern;

public class inheritanceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
		Cat c = new Cat("American");
		
	}

}

class Animal {
	String color;
	
}

class Cat extends Animal {
	Cat(String type) {
		System.out.println("type");
	}
	
}

class Dog extends Animal {
	Dog() {
		System.out.println("Bark");
	}
}
