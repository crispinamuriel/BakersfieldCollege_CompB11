package Week05;
import java.util.Scanner;
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
		//bring in scanner to get user input
		Scanner in = new Scanner(System.in);
		//keep a variable for the number of attempts
		int attempts = 0;
		// keep a variable for the while loop to continue
		boolean gameIsRunning = true;
		//print to console the prompt give in example above Guess my number:
		System.out.println("I have a number between 1 and 100");
		//keep a variable for the random number generated and generate it using the built-in class as follows :
		int randomNumbers = (int) (Math.random() * 100) + 1;


		//begin logic to process user input:
		//Use a while loop to keep the game running
		while (gameIsRunning) {
			// prompt user for guess
			System.out.print("Guess my number: ");
			//use scanner to get user input
			int userInput = in.nextInt();
			//increment user attempts
			attempts++;
			//if user input is too high 
			if(userInput < randomNumbers) {
				//output given text above Too low.	
				System.out.println("Too low.");
			}

			//if user input is too low
			else if (userInput > randomNumbers) {
				//output given text above Too high.
				System.out.println("Too high.");
			}
			//if user input is exactly randomly generated number
			else if(userInput == randomNumbers) {
				//output correct and end game by printing out the text with number of attempts
				System.out.println("Correct!");
				System.out.println("You guessed the numbers in " +attempts+" attempts");
				//turn while loop off, game is over.
				gameIsRunning = false;
			}
		}
	}
}
