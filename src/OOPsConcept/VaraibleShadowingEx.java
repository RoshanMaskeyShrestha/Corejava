package OOPsConcept;

public class VaraibleShadowingEx {
	int a=20;
	
	static int b=9;
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int a=8;
	    int b=7;
	    
		System.out.println(a);
		VaraibleShadowingEx v=new VaraibleShadowingEx ();
		System.out.println(v.a);
		v.display();
		
		System.out.println(VaraibleShadowingEx.b);
		System.out.println(b);
		
		
	
		
    
	}

}
