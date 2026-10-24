package Week05;
/**
 * File Name: PrintingPatternV.java
 * @author Crispina Muriel
 * Course: COMP B11 - 73478
 * Date: October 24, 2026
 * 
 * Description: Java program that generates the following V shaped pattern output using nested looping 				(must use both do-while and for statements) and maintain the correct number of spaces.
 *		   *      *
 *			*    *
 *			 *  *
 *			  **
 *		 
 *			* 1 2 3 4 5 6 *
 *			1 * 1 2 3 4 *
 *			1 2 * 1 2 *
 *			1 2 3 * *
 */
public class PringPatternV {

	public static void main(String[] args) {
		// hard coded strings for the creation of the v
		String[] stringArray = { "*      *",
							     " *    * ",
						         "  *  *  ",
						         "   **   ",
		                    };
		// keep a variable for the while loop
		int row = 0;
		// while loop for rows
		while(row <= 3) {
			for(int i = 0; i < 8; i++) {
				System.out.print(stringArray[row].charAt(i));
			}
			row++;
			System.out.println();
		}
	}

}
