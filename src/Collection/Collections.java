package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. ArrayList
		
		ArrayList<String> studentList = new ArrayList<>();
		
		//Add
		studentList.add("Student1");
		studentList.add("Student2");
		studentList.add("Student3");
		studentList.add("Student4");
		
		//Get
		String s = studentList.get(2);
		System.out.println("Student is:" +s);
		
		//Update
		System.out.println("Updated element is: "+studentList.set(3, "student5"));
		
		//Delete
		System.out.println("Deleted elemet: "+studentList.remove(0));
		
		//Size
		System.out.println("Size of array: "+ studentList.size());
		
		//To print array elements
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Student list is: "+studentList.get(i));
		}
		
	}

}
