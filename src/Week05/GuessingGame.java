import java.util.Scanner;
package Week05;
/**
 * File Name: GuessingGame.java
 * @author Crispina Muriel
 * Course: COMP B11 - 73478
 * Date: October 24, 2026
 * 
 * Description: Java program Guessing Game, that generates a random 
 * secret number between 1 and 100. Asks the user to input a guess and gives feedback if wrong or correct.
 */

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//psudocode as per project instructions:

		//bring in scanner to get user input
		Scanner in = new Scanner(System.in);
		//keep a variable for the number of attempts
		int attempts = 0;
		//print to console the prompt give in example above Guess my number:
		System.out.println("I have a number between 1 and 100");
		//use scanner to get user input
		int userInput = in.nextInt();
		
		//keep a variable for the random number generated and generate it using the built-in class as follows :
		int randomNumbers = (int) (Math.random() * 100) + 1;

//		 * 
//		 * begin logic to process user input:
//		 * Use a while loop to keep the game running
//		 * 		if user input is too high 
//		 * 			output given text above Too low.
//		 * 		if user input is too low
//		 * 			output given text above Too high.
//		 * 		if user input is exactly randomly generated number
//		 * 			output correct and end game by printing out the text with number of attempts
//		 * 			turn while loop off, game is over.
//		 *
//			int randomNumbers = (int) (Math.random() * 100) + 1;
//		
			
			
		/*
			Example (the green text indicates user input):
			I have a number between 1 and 100
			Guess my number: 50
			Too high.
			Guess my number: 25
			Too low.
			Guess my number: 37
			Too high.
			Guess my number: 32
			Correct!
			You guessed the numbers in 4 attempts
		 */
		


	}

}
