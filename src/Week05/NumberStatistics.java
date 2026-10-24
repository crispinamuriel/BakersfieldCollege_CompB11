package Week05;
import java.util.Scanner;
/**
 * File Name: NumberStatistics.java
 * @author Crispina Muriel
 * Course: COMP B11 - 73478
 * Date: October 23, 2026
 * 
 * Description: Java program that asks the user to input a series of integer numbers until the 
 * user enters a sentinel non-integer value such as the word “Stop” or “Quit” or “Q”. 
 * Scanner is used for input and use hasNextInt() method from the Scanner to test 
 * the incoming input value. 
 */

public class NumberStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a Java program that asks the user to input a series of integer numbers until the user
enters a sentinel non-integer value such as the word “Stop” or “Quit” or “Q”. Use Scanner scanr
for input and use hasNextInt() method from the Scanner to test the incoming input value.
DO NOT use arrays or lists in the program. The program uses one loop only and displays
the following statistics:
The total number of integers entered (use numTotals)
The number of positive integers (use numPositivs)
The number of negative integers (use numNegtives)
The number of zeros (use numZeros)
The number of even integers (use numEvens)
The number of odd integers (use numOdds)
The sum of all integers (use numSums)
The average of all integers (use numAverages)
The smallest integer (use numMins)
The largest integer (use numMaxs)
You may use any scenario from the two examples below:*/ 

		//psudocode as per directions:
		
		// sentinel variable to stop loop
		boolean sentinelNotFound = true;
		
		// get user input
		Scanner in = new Scanner(System.in);

		// use only one loop on condition on user input is not Q
		while(sentinelNotFound) {
			// use hasNextInt() method from the Scanner to test the incoming input value.
			
		}
		// check input if number or == "Q" to stop
		// if input is a number, continue if input is a "Q" stop
		
		// if numbers continue:
			// total number of integers entered (keep a count variable for total number of integers)
			// if user input is an integer, add to variable
		
			// keep total number of positive nums as a variable
            // if user input is a positive integer, add to variable
		
			// keep total number of negative nums as a variable
			// if user input is a negative integer, add to variable
			
			// keep total number of evens
			// if user input is even, add to even var
		
			// keep total number of odds
			// if user input is odd, add to odd var
		
			// keep a variable for average
		
			// keep a variable for smallestInteger
			// keep a variable for biggestInteger
		
		/* Example output expected:
		 *  Enter an integer (Q to stop): 15
			Enter an integer (Q to stop): 8
			Enter an integer (Q to stop): -3
			Enter an integer (Q to stop): 0
			Enter an integer (Q to stop): 12
			Enter an integer (Q to stop): -7
			Enter an integer (Q to stop): Q
			Number Statistics
			-----------------
			Total numbers: 6
			Positive numbers: 3
			Negative numbers: 2
			Zeros: 1
			Even numbers: 3
			Odd numbers: 3
			Sum: 25
			Average: 4.17
			Smallest number: -7
		 * 
		 * 
		 */
		
	}

}
