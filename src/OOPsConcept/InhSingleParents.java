package OOPsConcept;

public class InhSingleParents {
	String name;
	int age;
	InhSingleParents(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	InhSingleParents(int age)
	{
		this(null,30);
	}
	void view()
	{
		System.out.println("name is : " + name);
		System.out.println("age is : " + age );
	}
}



