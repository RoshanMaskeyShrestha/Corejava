package InstantBlock;

public class StaticTest {
	String name;
	int rollNo;
	int id=120;
	static String  collname="XYZ";
	static int count=0;
	public StaticTest(String name)
	{
		this.name=name;
		
		this.rollNo=setrollNo();
		
		
	}
	
	
	
	  static int  setrollNo()
	{
		  
		count++;
		return count;
		
		
	}
	public  void studentDisplay()
	{
		System.out.println("name : "+this.name);
		System.out.println("rollNo. : " + this.rollNo);
		System.out.println(collname);
		
		
	}
	
	

	public static void main(String[] args) {
		StaticTest s1= new  StaticTest("roshan");
		s1.studentDisplay();
		StaticTest s2=new  StaticTest("roman");
		s2.studentDisplay();
		StaticTest s3=new  StaticTest("romanp");
		s3.studentDisplay();
		StaticTest s4=new  StaticTest("romani");
		s4.studentDisplay();
		
		
	
		
		
     
		
	}

}
