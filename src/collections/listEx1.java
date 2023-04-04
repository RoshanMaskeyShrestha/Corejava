package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class listEx1 {

	public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(10);
    al.add(90);
    al.add(30); 
    al.add(80);
 /*   System.out.println(al.get(0));
    System.out.println(al.get(al.size()/2));
    ArrayList<Integer>al1=new ArrayList<>();
    al1.add(190);
    al1.add(50);
    al.addAll(al1);
    System.out.println(al);
    Collections.sort(al);
    for (Integer i : al) {
   	System.out.println(i);
		
	}
	 
	 */
    Iterator <Integer> a= al.iterator();
    while(a.hasNext())
    {
    	System.out.println(a.next());
    }
    Collections.sort(al);
    
    
    
    
  
    

}

	private static void Iterator() {
		// TODO Auto-generated method stub
		
	}
}

