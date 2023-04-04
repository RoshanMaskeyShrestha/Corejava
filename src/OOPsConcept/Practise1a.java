package OOPsConcept;

public class Practise1a extends Practise1{
	public void welcome() {
		System.out.println("welcome2");
	}
	
		public void bye() {
			System.out.println("bye");
		}
		public static void main(String[]args) {
			Practise1 p3=new Practise1();
			p3.welcome();
			Practise1 p=new Practise1a();
			p.welcome();
			Practise1a p2=(Practise1a)p;
			p2.welcome();
			p2.bye();
			
			
			
		
	}

}
