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
		
		// variables
		// sentinel variable to stop loop
		boolean sentinelNotFound = true;

		// sum of integers
		int numSum = 0;
		// total number of integers entered (keep a count variable for total number of integers)
		int numTotals = 0;
		
		// keep total number of positive nums as a variable
		int numPositivs = 0;
        
		// keep total number of negative nums as a variable
		int numNegtives = 0;
		
		// keep a total number of zeros
		int numZeros = 0;
		
		// keep total number of evens
		int numEvens = 0;
		
		// keep total number of odds
		int numOdds = 0;
		
		// keep a variable for average
		int numAverages = 0;
		
		// keep a variable for smallestInteger
		int numMin = 100000000;
		
		// keep a variable for biggestInteger
		int numMax = -100000000;
		
		// get user input
		Scanner in = new Scanner(System.in);
		
		// get nextInteger from user input

		// use only one loop on condition on user input is not Q
		while(sentinelNotFound) {
			// use hasNextInt() method from the Scanner to test the incoming input value.
			// check input if number or == "Q" to stop
			System.out.print("Enter an integer (Q to stop): ");
			
			if(in.hasNextInt()) {
				// if numbers continue:
				int currentInteger = in.nextInt();
				// logic to process integers
				
				// add all integers to sum for the average
				numSum += currentInteger;
				
				// because user input is an integer, increment integer to variable
				numTotals++;
				
				// if user input is a positive integer, add 1 to variable
				if(currentInteger > 0 ) numPositivs++;
				
				// if user input is a negative integer, add 1 to variable
				if(currentInteger < 0) numNegtives++;
				
				// if user input is zero, add to 1 numZeros variable
				if(currentInteger == 0) numZeros++;
				
				// if user input is even, add to 1 even var
				if(currentInteger % 2 == 0) numEvens++;
				
				// if user input is odd, add to 1 odd var
				if(currentInteger % 2 != 0) numOdds++;
				
				// if user input is less than smallest save it
				if(currentInteger < numMin) numMin = currentInteger;
				
				// if user input is greater than largest save it
				if(currentInteger > numMax) numMax = currentInteger;
				
			} else if (in.next().equals("Q")){
				// if input is a "Q" stop
				sentinelNotFound = false;
			}
	
		}
		double numAverage = (double) numSum / numTotals;
		// Print out statistics
		System.out.println("Number Statistics");
		System.out.println("-----------------");
		System.out.println("Total numbers: " + numTotals);
		System.out.println("Positive numbers: " + numPositivs);
		System.out.println("Negative numbers: " + numNegtives); // this is mispelled on purpose?
		System.out.println("Zeros: " + numZeros);
		System.out.println("Even numbers: " + numEvens);
		System.out.println("Odd numbers: " + numOdds);
		System.out.println("Sum: " + numSum);
		System.out.println("Average: " + numAverage);
		System.out.println("Smallest number: " + numMin);
		System.out.println("Largest number:" + numMax);
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
			Largest number: 15
		 * 
		 * 
		 */
		
	}

}
