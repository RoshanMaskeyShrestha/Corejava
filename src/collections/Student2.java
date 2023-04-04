package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student2 implements Comparable<Student2 >{
	String name;
    int id;
    
    public  Student2 (String name, int id) {
    	this.name=name;
    	this.id=id;
    }
    public String toString() {
    	return name+"  "+id;
    }
    public int compareTo(Student2 s) {
    	if(this.name.compareTo(s.name)>1) 
    		return 1;
    	
    	elseif(this.name.compareTo(s.name)<0)
    		return -1;
    	
    	else 
    		return 0;
    	
    		
		
    	
    }

	public static void main(String[] args) {
		ArrayList< Student2> al=new ArrayList<Student2>();
		al.add(new Student2("roshan",101));
		al.add(new Student2("rozan",108));
		al.add(new Student2("roman",1011));
		for (Student2 s : al) {
			
		}
		
		
	}
	
	

}
