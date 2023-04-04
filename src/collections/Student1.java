package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Student1 {
	String name;
    int id;
    
    public  Student1 (String name, int id) {
    	this.name=name;
    	this.id=id;
    }
    public String toString() {
    	return name+"  "+id;
    }
    public int compareTo(TreeSetUserObj t) {
    	if(this.name.compareTo(t.name)>1)
    	
		return 1;
    	else if(this.name.compareTo(t.name)<1)
    		return -1;
    	else return 0;
    }

	public static void main(String[] args) {

		//HashMap<Integer, Student1> h=new HashMap<Integer,Student1>();
		TreeMap<Integer, Student1> h=new TreeMap<Integer,Student1>();
		h.put(56, new Student1("roshan",102));
		h.put(78,new Student1("niranjan" ,108));
		h.put(89,new  Student1("utam",56));
		System.out.println(h.entrySet());
		/*
		System.out.println(h.keySet());
		System.out.println(h.values());
		h.putIfAbsent(28, new Student1("smas", 895));
		System.out.println(h);
		System.out.println(h.containsKey(89));
		System.out.println(h.remove(56));
		System.out.println(h);
		*/
		
		
	}

}
