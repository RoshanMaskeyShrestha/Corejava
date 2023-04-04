package OOPsConcept;

public class NonStaticInitializer {
	{
	System.out.println("hello non-static");	
		
		
	}
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		NonStaticInitializer n=new NonStaticInitializer();
		
	}
	

}
