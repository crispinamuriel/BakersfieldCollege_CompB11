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
		in.nextLine();
		int index = 0;
		// Array of Books
		Book [] books = new Book[40];
		
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
		}
		System.out.print(Book.getBookStatusFromCode('X'));
		in.close();
	}
}


/*
 * 
Part 2: Create the LibraryDemo Class
 
Create a class named LibraryDemo containing the main() method.
Your program must perform the following operations:
Task 1: Read the input text file “books.csv” that contain the books information
Use a scanner to scan and parse the tokens form the text file. To properly scan the text file
contents: use the Scanner method useDelimiter(",|\\r?\\n") which means the
delimiter between tokens is either a comma or an end of line symbol.
The text file has a header which you may want to read and ignore:
bookId,title,author,isbn,available,genre,pages,status,shelf
Ignore the first line read from the text file because it is a header (Hint: use nextLine()
method to read it)
Task 2: Create Book Objects Array: Create an array of Book objects from the data read
from the file. In addition, create two new books using both constructor methods.
Task 3: Display All Books Information: Display the information for all books.
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



