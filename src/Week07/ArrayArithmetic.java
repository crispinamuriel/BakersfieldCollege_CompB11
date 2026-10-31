package Week07;

import java.util.Scanner;
/**
 * Array Arithmetic Using Methods 
 */
public class ArrayArithmetic {

    /**
     * Enter values into an array
     * @param array
     * @param input
     */
    public static void enterArray(int[] array, Scanner input) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
    }

    /**
     * Add two arrays: result = a + b
     * @param a
     * @param b
     * @param result
     */
    public static void addArrays(int[] a, int[] b, int[] result) {

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
    }

    /** Subtract two arrays: result = a - b
     * @param a
     * @param b
     * @param result
     */
    public static void subtractArrays(int[] a, int[] b, int[] result) {

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
    }

    /**
     * Multiply two arrays: result = a * b
     * @param a
     * @param b
     * @param result
     */
    public static void multiplyArrays(int[] a, int[] b, int[] result) {
			
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        
    }

    /**
     * Divide two arrays: result = a / b
     * @param a
     * @param b
     * @param result
     */
    public static void divideArrays(int[] a, int[] b, int[] result) {

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] / b[i];
        }
    }
    

    /**
     * Display an array
     * @param array
     */
    public static void displayArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
    
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for the array size
        System.out.print("How many elements? ");
        int size = input.nextInt();

        // Create the arrays
        int[] arrayA = new int[size];
        int[] arrayB = new int[size];

        int[] addition = new int[size];
        int[] subtraction = new int[size];
        int[] multiplication = new int[size];
        int[] division = new int[size];

        // Enter values for Array A
        System.out.println("\nEnter values for Array A:");
        enterArray(arrayA, input);

        // Enter values for Array B
        System.out.println("\nEnter values for Array B:");
        enterArray(arrayB, input);

        // Perform arithmetic operations
        addArrays(arrayA, arrayB, addition);
        subtractArrays(arrayA, arrayB, subtraction);
        multiplyArrays(arrayA, arrayB, multiplication);
        divideArrays(arrayA, arrayB, division);

        // Display results
        System.out.println("\n----- Array Arithmetic -----");

        System.out.println("\nArray A:");
        displayArray(arrayA);

        System.out.println("\nArray B:");
        displayArray(arrayB);

        System.out.println("\nAddition:");
        displayArray(addition);

        System.out.println("\nSubtraction:");
        displayArray(subtraction);

        System.out.println("\nMultiplication:");
        displayArray(multiplication);

        System.out.println("\nDivision:");
        displayArray(division);

        input.close();
    }
}
