package Week03;
import java.util.Scanner;
/**
* Java program that reads integer numbers from the console. 
* Then the program will print a message indicating whether the number is positive zero, or negative. 
* Program prints whether the number is even or odd. Uses Scanner object to read user input.
*
* @author Crispina Muriel
* Course: COMS B11 - 73478
* Created: Sep 12, 2026
* Source File: NumberAnalyzer.java
*/
public class NumberAnalyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer number: ");	
		int num = scanner.nextInt();
		
		if (num == 0) 
		{ 
			System.out.println("The number " + num + " is zero");
			System.out.println("The number " + num + " is positive");
			System.exit(0);
		}
		
		boolean isEven;
		boolean isPositive;
		

		isEven = num % 2 == 0;
	
		isPositive = num > 0;

		
		if (isPositive) {
			System.out.println("The number " + num + " is positive");
		}
		else 
		{
			System.out.println("The number " + num + " is negative");
		}
		
		if (isEven) {
			System.out.println("It is an even number");
		}
		else 
		{
			System.out.println("It is an odd number");
		}
		scanner.close();
		
	}

}
