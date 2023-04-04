package Constructor;

public class overloading {
	
	int a;
	String c;
	float f;
	

	public overloading(int a) {
		this.a=a;
	}
	public overloading(int a ,String c) {
		this.a=a;
		this.c=c;
	}
	public overloading(int a,float f) {
		this.a=a;
		this.f=f;
	}
	public void roshan() {
		System.out.println("hi");
	}
	public void roman() {
		roshan();
	}

		
	
	public static void main(String[] args) {
		overloading s1=new overloading(25);
		System.out.println(s1.a);
		s1.roman();
		overloading s2=new overloading(50,"roshan");
		System.out.println(s2.c + " "+s2.a);
		overloading s3=new overloading(56,89.23f);
		System.out.println(s3.f+" "+s3.a);
		
		
     
	}

}
