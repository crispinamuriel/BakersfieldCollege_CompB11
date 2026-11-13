package Week12Assignment;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LibraryDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// read each line and save in an array of books! 
		File inFile = new File("books.csv");
		Scanner in = new Scanner(inFile);
		
		in.nextLine();
		
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
			
			
		}
		in.close();
	}
}


// assignment will be similar, have something new!
// books.csv has 6 lines disregaurd the first line, the first token is book id second is title then author, then isbn, then available. 
// read the books from a text file, just give the name of the book and read it as a text file, one thing ou have to consider

// when you call a scanner and you have .next() .nextLine() if you read nextline for the first one it will be skipped
// when uyou do .next() for the rest it will not read those tokens you must pass the delimiter to ","

// useDelimiter(",");
// in.useDelimiter(",");
// in.nextInt(); => bookId
// in.next(); -> title
// in.next(); -> author
// in.next(); -. 

// read each line and save in an array of books! 
//File inFile = new File()"books.csv");
//Scanner in - new Scanner(inFIle);
//
//while in.hasNext())
//
//books[index] = new Book(title,auther);
//
//books[index].displayInfo();
//index++;



