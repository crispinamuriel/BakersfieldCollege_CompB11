package Week12Assignment;

public class Book {
	//  Static Shared Class Variables // we are able to initialize because they are shared across all objects
	private static int nextBookId = 1001;
	private static int totalBooksCreated = 0;
	private static int totalBooksBorrowed = 0;
	private static String libraryName = "Not set yet";
	private static int totalBooksDamaged = 0;
	
	//  Private instance variables 
	private int bookId; // cannot initialize because we have no object associated
	private String title;
	private String author;
	private String isbn;
	private boolean available;
	private String genre;
	private int pages;
	private char status;
	private String shelf;
	
	
	// Default constructor
	public Book() {
		bookId = nextBookId++;
		title = "Unknown";
		author = "Unknown";
		isbn = "Not Assigned";
		available = true;
		
		totalBooksCreated++;
	}
    // Constructor Overloading, all fields passed as arguments
	public Book(int bookId, String title, String author, String isbn, boolean available, String genre, int pages, char status, String shelf) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = available;
		this.genre = genre;
		this.pages = pages;
		
		totalBooksCreated++;
	}

	public int getBookId() {
		return this.bookId;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getIsbn(){
		return this.isbn;
	}
	
	public boolean isAvailable(){
		return this.available;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public void borrowBook(){
		if(this.available) {
			this.available = false;
		} else {
			System.out.println("This book is unavailable!");
		}
	}
	
	public void returnBook(){
		if(!this.available) {
			this.available = true;
		} else {
			System.out.println("This book has already been returned!");
		}
	}
	
	public void displayInfo(){
		System.out.println("BOOK INFORMATION: ");
		System.out.println();
		System.out.println("Book Id: " + this.bookId);
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("ISBN: " + isbn);
		System.out.println("Status: " + (available ? "Availaible" : "Borrowed"));
		System.out.println();
	}
	
	public static int getTotalBooksCreated() {
		return totalBooksCreated;
	}
	
	public void displayTotalBooksCreated() {
		System.out.print("Total Books Created: " + totalBooksCreated);
	}

}
