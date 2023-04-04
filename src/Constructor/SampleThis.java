package Constructor;

public class SampleThis {
	 String s="Roshan";
	 void washHand()
	 {
		 System.out.println("WashHand");
	 }
	 void serveFood()
	 {
		 System.out.println("servefood");
	 }
	 void eat()
	 {
		this. washHand();
		 this.serveFood();
		this. washHand();
	 }
	public static void main(String[]args)
	{
		
		SampleThis s= new SampleThis();
		s.eat();
		
		
				
	}
}
