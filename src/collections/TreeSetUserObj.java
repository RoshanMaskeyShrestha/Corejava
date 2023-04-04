package collections;

import java.util.TreeSet;

public class TreeSetUserObj implements Comparable<TreeSetUserObj> {
	String name;
    int id;
    
    public  TreeSetUserObj (String name,int id) {
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
		TreeSet< TreeSetUserObj> t=new TreeSet<>();
		t.add(new TreeSetUserObj("zoo", 100));
		t.add(new TreeSetUserObj("ayagga", 105));
		for(TreeSetUserObj i:t) {
			System.out.println(i);
		}

	}

}
