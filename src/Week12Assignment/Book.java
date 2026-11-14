package Week12Assignment;
/**
 * File Name: Book.java
 * Author: @author Crispina Muriel
 * Course: COMPB11 - 73478
 * Date: November 14,2026
 * Description: Java program named Book.java that Defines the Book class
 * 
 */

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
	// Accessor methods
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
	public int getPages() {
		return this.pages;
	}
	public char getStatus( ) {
		return this.status;
	}
	public String getShelf() {
		return this.shelf;
	}
	
	// Mutator methods
	/**	
	 * setBookId method takes a new book id and Updates the book ID.
	 * @param bookId - Integer - Unique identification number
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * setTitle method takes a new book title String and Updates the book title.
	 * @param title - String - Book title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * setAuthor method takes a new author String and Updates the author's name.
	 * @param author - String - Author's name.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * setIsbn method takes a new isbn String and Updates the ISBN.
	 * @param isbn - String - International Standard Book Number
	 */
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	/**
	 * setAvailable method that Updates the book availability (available=true/borrowed=false)
	 * @param available - boolean - Indicates whether the book is available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * setGenre method that takes genre String and Updates the book genre.
	 * @param genre - String - Book category.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * setPages method that Updates the number of pages.
	 * @param pages - Integer - Number of book pages
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	// Changes availability to false if the book is available. Increments the total number of books borrowed.
	public void borrowBook(){
		if(this.available) {
			this.available = false;
			totalBooksBorrowed++;
		} else {
			System.out.println("This book is unavailable!");
		}
	}
	// Changes availability to true if the book is borrowed. Decrements the total number of books borrowed.
	public void returnBook(){
		if(!this.available) {
			this.available = true;
			totalBooksBorrowed--;
		} else {
			System.out.println("This book has already been returned!");
		}
	}
	//Displays all information about the book.
	public void displayInfo(){
		System.out.println("BOOK INFORMATION: ");
		System.out.println();
		System.out.println("Book Id: " + this.bookId);
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("ISBN: " + isbn);
		System.out.println("Available for Checkout: " + (available ? "Availaible" : "Borrowed"));
		System.out.println("Genre: " + this.genre);
		System.out.println("Pages: " + this.pages);
		System.out.println("Status: " + this.getBookStatusFromCode(this.status));
		System.out.println("Shelf: " + this.shelf);
		System.out.println();
	}
	
	/**
	 * Helper method - getBookStatusFromCode
	 *	code legend:
	 *	‘D’: "Damaged" ‘L’: "Lost"
	 *	‘0’: "New" ‘1’: "Good shape"
	 *	‘2’: "Minor wear" ‘3’: "Moderate wear"
	 *	‘4’: "Heavy wear" ‘5’: "Too worn"
	 *	‘X’: "Unknown"
	 * @param status character code for status of book
	 * @return Returns the string that represents the status
	 */
	public String getBookStatusFromCode (char status) {
        switch (status) {
	        case 'D':
	            return "Damaged";
	
	        case 'L':
	            return "Lost";
	
	        case '0':
	            return "New";
	
	        case '1':
	            return "Good shape";
	
	        case '2':
	            return "Minor wear";
	            
	        case '3':
	            return "Moderate wear";
	
	        case '4':
	            return "Heavy wear";
	
	        case '5':
	            return "Too worn";
	
	        case 'X':
	            return "Unknown";
	
	        default:
	            return "Invalid status code.";
        }
	}
	// Returns the total number of Book objects created.
	public static void displayTotalBooksCreated() {
		System.out.print("Total Books Created: " + totalBooksCreated);
	}
	// Returns the total number of Book objects created.
	public static int getTotalBooksCreated() {
		return totalBooksCreated;
	}
	// Returns the total number of Book objects borrowed.
	public static int getTotalBooksBorrowed() {
		return totalBooksBorrowed;
	}
	// Returns the total number of Book objects damaged.
	public static int getTotalBooksDamaged() {
		return totalBooksDamaged;
	}
	// Returns the library name.
	public static String getLibraryName() {
		return libraryName;
	}
	// Updates the library name of Book class.
	public static void setLibraryName(String libName) {
		libraryName = libName;
	}
	// Task 6:
	// listBooks(Book[] books, String shelf) 
	// Display all books’ titles that are on the specified shelf
	public static void listBooks(Book[] books, String shelf) {
		System.out.println("List of books’ titles that are on shelf " + shelf + ":");
		for(Book book: books) {
			if(book != null && book.getShelf().equals(shelf)) {
				System.out.println(book.getTitle());
			}
		}
		System.out.println();
	}
	// listBooks(Book[] books, char status)
	// Display all titles that have the specified status, such as 'L' for lost books
	public static void listBooks(Book[] books, char status) {
		System.out.println("List of books’ titles that have status code " + status + ":");
		for(Book book: books) {
			if(book != null && book.getStatus() == status) {
				System.out.println(book.getTitle());
			}
		}
		System.out.println();
	}
	// listBooks(Book[] books, boolean available)
	// Display all books’ titles that are available or borrowed
	public static void listBooks(Book[] books, boolean available) {
		System.out.println("List of books’ titles that are" + (available == false ? " borrowed: ": " available: "));
		for(Book book: books) {
			if(book != null && book.isAvailable() == available) {
				System.out.println(book.getTitle());
			} 
		}
		System.out.println();
	}

}
