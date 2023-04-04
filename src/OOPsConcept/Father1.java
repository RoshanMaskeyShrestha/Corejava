package OOPsConcept;

public class Father1 {
	
	    public void work()
	    {
	        System.out.println("Earning Father");
	    }
	    public void pay() {
	    	System.out.println("hello");
	    }
	}
	  
	class Son1 extends Father1 {
	    public void play()
	    {
	        System.out.println("Enjoying son");
	        pay();
	    }
	
	  

	public static void main(String[] args) {
		Father1 f= new Son1();
		f.work();
		

	}

}
