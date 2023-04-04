package Constructor;

public class MethodOverloading2 implements   MethodOverloading {
	public void roshan() {
		System.out.println("no -arg");
		
	}
	public void roshan(int a,int b) {
		
	
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading2();
		m.roshan(10,20);
		m.roshan();
		
		
		
}

}
