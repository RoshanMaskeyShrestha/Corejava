package OOPsConcept;

public class InhSingleStudent extends InhSingleParents{
	int id;
	String stream;
	public InhSingleStudent(String name, int age,int id, String stream)
	{
	    super(name,age);
		this.id=id;
		this.stream=stream;
		
	}
	void profile()
	{
		super.view();
		System.out.println("id is : " + id );
		System.out.println("stream is : " + stream);
	}
	

	public static void main(String[] args) {
		InhSingleStudent i=new InhSingleStudent("roshan",22,513,"eee");
		i.profile();
		InhSingleParents i2=new InhSingleParents("roman",22);
		i2.view();
		InhSingleParents i3= new InhSingleParents(30);
		i3.view();

	}

}
