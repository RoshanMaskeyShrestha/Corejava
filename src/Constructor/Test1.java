package Constructor;

public class Test1 {
	int x=10;
}

	class Test2 extends Test1
	{
		int x=50;
		public void m1()
		{
		
		System.out.println(this.x);
		System.out.println(super.x);
		}
	}
	class ExecutesTest12
	{
		public static void main(String[]args)
		{
			Test2 a=new Test2();
			a.m1();
		}
		
				
	}
