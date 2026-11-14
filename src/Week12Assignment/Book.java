package Week12Assignment;

public class Book {
	//  Static Shared Class Variables, able to be initialized because they are shared across all objects
	private static int nextBookId = 1001; // used to assign a unique identification number to each new book.
	private static int totalBooksCreated = 0; // keeps track of the total number of Book objects created.
	private static int totalBooksBorrowed = 0; // keep track the total number of Book objects that are borrowed
	private static String libraryName = "Not set yet"; // name of library set in the LibraryDemo program
	private static int totalBooksDamaged = 0; // keeps track of the number of books that were damaged and removed.
	
	//  Private instance variables, cannot initialize because we have no object associated
	private int bookId; // Unique identification number
	private String title; // Book title
	private String author; // Author's name
	private String isbn; // ISBN number
	private boolean available; // Indicates whether the book is available to borrow
	private String genre; // Book category
	private int pages; // Number of book pages
	private char status;
	/**
	 * Book status legend:
	 *	D: Damaged
	 *	L: Lost
	 *	0: New
	 *	1: Good shape
	 *	2: Minor wear
	 *	3: Moderate wear
	 *	4: Heavy wear
	 *	5: Too worn
	 *	X: Unknown
	 */
	private String shelf; // Location in library (e.g. A3)
	
	
	// Default constructor
	public Book() {
		bookId = nextBookId++;
		title = "Not set yet";
		author = "Not set yet";
		isbn = "Not set yet";
		available = true;
		genre = "Not set yet";
		pages = 0;
		status = 'X';
		shelf = "Not set yet";
		
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
		this.status = status;
		this.shelf = shelf;
		
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
	public boolean isBorrowed() {
		return !this.available;
	}
	public String getGenre() {
		return this.genre;
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
