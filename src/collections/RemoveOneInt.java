package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RemoveOneInt {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("roshan");
		al.add("roman");
		al.add("rochak");
		ListIterator<String> l= al.listIterator();
		while(l.hasNext()) {
			String e=l.next();
			if(e.equals("roman"))
				l.set("ram");
			
		}
		System.out.println(al);
		
				
	}
			
			

		
	}
	


