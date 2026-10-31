package Week10;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordNumberer2{

	public static void main(String[] args) throws FileNotFoundException {
		// create var to hold count
		int counter = 0;
		// declare input file
		File inputFile = new File("words2.txt");
		// read wrapped file in File Class
		Scanner in = new Scanner(inputFile);
		// declare output file
		PrintWriter out = new PrintWriter("FINDME.txt");
		// process file
		while(in.hasNext()) {
			String token = in.next();
			counter++;
			out.println(counter + ". " + token);
		}
		// close in and out
		in.close();
		out.close();
		
		// print console logs letting user know program status
		System.out.println("Program has finished running.");
		System.out.println("Total tokens counted: " + counter);
	}

}
