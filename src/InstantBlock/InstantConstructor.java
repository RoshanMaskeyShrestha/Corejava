package InstantBlock;

public class InstantConstructor {
	static int count=0;
	{
		
		count++;
		
		
	}
	InstantConstructor()
	{
	
	}
	InstantConstructor(int i)
	{
		
	}
	InstantConstructor(double d)
	{
		
	}
	
	

	public static void main(String[] args) {
		InstantConstructor a=new InstantConstructor();
		InstantConstructor b= new InstantConstructor(10);
		InstantConstructor c=new InstantConstructor(10.5);
		System.out.println(count);
		
	}

}
