package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx1 implements Comparable<ComparableEx1> {
	String name;
	int id;
 public 	ComparableEx1(String name,int id) {
	 this.name=name;
	 this.id=id;
 }
 public String toString(){
	 return name+" "+id;
	 
 }
 public int compareTo(ComparableEx1 c)
 {
   if(this.id>(c.id))
   return 1;
   else if(this.id<(c.id))
   return -1;
   else
   return 0;

 }

  
 
	 
 
	
	
	
	

	public static void main(String[] args) {
		ArrayList<ComparableEx1> al=new ArrayList<ComparableEx1>();

		al.add(new ComparableEx1("roshani",103));
		 al.add(new ComparableEx1("roshan",102));
		Collections.sort(al);
		System.out.println(al);
		
		
		

	}

}
