package library;

public class Book {
	
	private String name;
	private  int bookid=0;
	private String author;
	
	
	public Book(String name, String author, int bookid) {
		super();
		this.bookid=bookid;
		this.name = name;
		this.author = author;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void Display() {
		System.out.println("Book Id : "+ bookid);
		System.out.println("Book Name : "+this.name);
		System.out.println("Book Author : "+ this.author);
		
	}

}
