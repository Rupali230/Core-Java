package in.com.rays.Collection;

import java.util.ArrayList;
import java.util.List;
 
public class Text {

	public static void main(String[] args) {
		
		 List  li	= new  ArrayList();

		li.add(21);
		li.add(3.6);
		li.add('a');
		li.add("Rays");
		
		System.out.println(li);
		
		for (Object o:li) {
			
		System.out.println(o);
		}
		
		List  a = new ArrayList ();
		
		a.add(23);
		a.add(56);
		a.add(45);
		//a.addAll(li);
		//a.clear();
		// System.out.println(a.contains(23));
		//a.containsAll(a);
	System.out.println(a.isEmpty());
		//a.remove(4);
		//a.removeAll(li);
		//a.retainAll(a);
		a.size(); 
		System.out.println(a);
		
				
		
	}
}