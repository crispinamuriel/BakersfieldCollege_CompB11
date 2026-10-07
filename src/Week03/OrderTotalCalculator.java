package Week03;
import java.util.Scanner;
/**
* Java program that reads three values user input. 
* Then the program will calculate the final amount a customer pays for online order.
* Uses Scanner object to read user input.
*
* @author Crispina Muriel
* Course: COMS B11 - 73478
* Created: Sep 12, 2026
* Source File: OrderTotalCalculator.java
*/
public class OrderTotalCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the cost: ");
		float cost = scanner.nextFloat();
		System.out.print("Enter the shipping fee: ");
		float shippingFee = scanner.nextFloat();
		boolean freeShipping = cost >= 35;
		double tax = cost * 0.0825;
		
		System.out.printf("Subtotal = %.2f%n", cost);
		System.out.println("Tax = " + tax);
		System.out.println(freeShipping ? "Enjoy free shipping!" : "Shipping = " + String.format("%.2f", shippingFee));		
		System.out.println("Total = " + (cost + tax));
		scanner.close();
	}

}
