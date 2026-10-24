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
		// TODO Auto-generated method stub
		/*
		  
		 Program 3 : V Pattern Printer (name it PrintPatternV.java) 25 points
				Write a program to generate the following V shaped pattern output. Use nested looping
				(must use both do-while and for statements) and maintain the correct number of spaces.
			   *      *
				*    *
				 *  *
				  **
				 
				* 1 2 3 4 5 6 *
				1 * 1 2 3 4 *
				1 2 * 1 2 *
				1 2 3 * *
				
				
		 */
		
		// psudocode as per instructions above
		
		/*
		 * I want to use a while loop for the outer loop and I will know it's done  when i've counted 4 rows
		 * I want to use a for loop for the inner loop and i'll know it's done when i've iterated i from 0 to 7 
		 * Inside the while I will need to nest the for loop
		 * inside the for loop I will begin printing the v
		 * I am going to hard code the v printing instead of using the index for the rows and columns. 
		 * each line looks as above so all I really have to do is print out the lines above inside the nested loops
		 */
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
