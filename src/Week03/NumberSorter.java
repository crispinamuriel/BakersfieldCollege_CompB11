package Week03;
import java.util.Scanner;
/**
* Java program that reads three integer numbers (numA, numB and numC) from the
* input. Then uses if statements to find the smallest number (numSmall), the middle number
* (numMid), and biggest number (numBig).
* Then prints them in ascending order: numSmall ==> numMid ==> numBig
*
* @author Crispina Muriel
* Course: COMS B11 - 73478
* Created: Sep 10, 2026
* Source File: NumberSorter.java
*/

public class NumberSorter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter three Integer numbers:");
		
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int numC = scanner.nextInt();
		Integer numSmall = null;
		Integer numMid = null;
		Integer numBig = null;
		
		if (numA < numB && numA < numC) {
			numSmall = numA;
	    }
		if (numB < numA && numB < numC) {
			numSmall = numB;
	    }
		if (numC < numA && numC < numB) {
			numSmall = numC;
	    }
		
		if (numA > numB && numA < numC || numA < numB && numA > numC) {
			numMid = numA;
	    }
		if (numB > numA && numB < numC || numB < numA && numB > numC) {
			numMid = numB;
	    }
		if (numC > numA && numC < numB || numC < numA && numC > numB) {
			numMid = numC;
	    }
		
		if (numA > numB && numA > numC) {
			numBig = numA;
	    }
		if (numB > numA && numB > numC) {
			numBig = numB;
	    }
		if (numC > numA && numC > numB) {
			numBig = numC;
	    }
		
		System.out.print(numSmall + " ==> " + numMid + " ==> " + numBig);
		
		scanner.close();

	}

}
