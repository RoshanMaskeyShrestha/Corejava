package collections;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		for(Integer i:a) {
			System.out.println(i);
		}
		ListIterator<Integer>l= a.listIterator();
		while(l.hasNext()) {
			Integer e=l.next();
			
		}
 
	}

}
