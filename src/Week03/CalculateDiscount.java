package Week03;
import java.util.Scanner;

/**
 * This program reads a price from the user input, calculates the discount
 * amount and the sale price. If the price is greater than or equal to $100,
 * the discount rate is 20%, otherwise the discount rate is 10%.
 */
public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price: ");
        double price = in.nextDouble();
        double discountRate = 0.10;

        if (price >= 100) {
            discountRate = 0.20;
        }

        double discount = price * discountRate;
        double salePrice = price - discount;

        if (salePrice < 0) {
            System.out.println("Invalid sale price");
        } else {
            System.out.println("Sale price: $" + salePrice);
        }
        if (discountRate == 0.20) {
            System.out.println("You got 20% discount rate");
        } else {
            System.out.println("You got 10% discount rate");
        }
        in.close();
    }
}
