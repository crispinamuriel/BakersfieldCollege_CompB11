package Week10;
//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Description - Java program named WordNumberer.java that 
 * reads words from an input file and writes them to an output file, 
 * one word per line, preceded by its number. 
 */


public class WordNumberer {

	public static void main(String[] args) throws FileNotFoundException {
		// var
		int counter = 0;
		// declare input file
		File inputFile = new File("words.txt");
		// read wrapped file in File Class
		Scanner in = new Scanner(inputFile);
		// declare output file
		PrintWriter out = new PrintWriter("numbered.txt");
		// process file
		while(in.hasNext()) {
			String token = in.next();
			counter++;
			out.println(counter + ". " + token);
		}
		
		// close files
		in.close();
		out.close();
		System.out.println("Program has finished running.");
		System.out.println("Total tokens counted: " + counter);
	}

}
