package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hash {

	public static void main(String[] args) {

		HashMap<String, Student> stdlist = new HashMap<>();
		
		stdlist.put("abc", new Student(101, "abc", 25));
		stdlist.put("pqr", new Student(102, "pqr", 30));
		
		
		Set<String> s = stdlist.keySet();
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()){
			String key=it.next();
			System.out.println("Keys are: "+key+" values are: "+ stdlist.get(key).Rollno);
			
			/*stdlist.remove("abc");
			System.out.println("Values are:"+stdlist.get(key));*/
		}

	}

}
