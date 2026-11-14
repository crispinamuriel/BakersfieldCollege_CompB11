package Week12Assignment;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LibraryDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// read each line and save in an array of books! 
		File inFile = new File("books.csv");
		Scanner in = new Scanner(inFile);
		in.useDelimiter(",|\\r?\\n");
		// read and ignore text file has a header
		in.nextLine();
		int index = 0;
		// Array of Books
		Book [] books = new Book[32];
		
		while(in.hasNext()) {
			int bookId = in.nextInt();
			String title = in.next();
			String author = in.next();
			String isbn = in.next();
			boolean available = in.nextBoolean();
			String genre = in.next();
			int pages = in.nextInt();
			char status = in.next().charAt(0);
			String shelf = in.next();
			books[index] = new Book(bookId, title, author, isbn, available, genre, pages, status, shelf);
			index++;
		}
//		System.out.print(Book.getBookStatusFromCode('X'));
		// create two new books using both constructor methods
		Book book1 = new Book();
		Book book2 = new Book(1031, "The Lion, The Witch, and The Wardrobe", "C.S. Lewis", "9780064471046", true, "Fantasy", 500, '0', "A1");
		books[30] = book1;
		books[31] = book2;
		
		
		// Display the information for all books.
		for(Book book: books) {
			if (book != null) {
				book.displayInfo();
			}
		}
		// Task 4: Demonstrate Object References: Create a new reference to one of your existing Book objects from the array. For example:
		Book myBook;
		myBook = books[0];
		in.close();
	}
	
}


/*
 * 
Part 2: Create the LibraryDemo Class
 

Task 3: 
Task 4: Demonstrate Object References: Create a new reference to one of your existing
Book objects from the array. For example:
Book myBook;
MyBook = book[0];
Task 5: Demonstrate the Borrow and the Return of Books: Select myBook call its
borrowBook() method. Display the book information of book[0] to verify that its
availability status has changed.
Task 5: Write listBooks() overloaded method: to display books that match a criterion
depending on the parameter passed.
Method Description
listBooks(Book[] books, String shelf) Display all books’ titles that are on the
specified shelf
listBooks(Book[] books, char status) Display all titles that have the specified
status, such as 'L' for lost books
listBooks(Book[] books, boolean available) Display all books’ titles that are
available or borrowed
Call the above three methods to display:
- list of books’ titles that belong on shelf A1,
- list of books’ titles that are new, and
- list of books’ titles that are borrowed.

 */



