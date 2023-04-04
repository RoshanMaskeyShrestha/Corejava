package OOPsConcept;

public class BookStore1 {
	private String book;
	private String author;
	private int price;
	BookStore1(String book,String author,int price)
	{
		this.book=book;
		this.author=author;
		this.price=price;
	}
	public String getBook()
	{
		return book;
	}
	public String getAuthor()
	{
		return author;
		
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
		System.out.println("price updated");
	}
   void display()
   {
	System.out.println("book name is : " + getBook());
	System.out.println("author name is : " + getAuthor());
	System.out.println("bookprice is : " + getPrice());
	
   }
	

}
