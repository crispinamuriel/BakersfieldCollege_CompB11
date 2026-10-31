package Week07;
/**
 * Sum array elements using two different methods: loop and recursion
 */
public class ArraySum {

    /**
     * Method 1: Calculate sum using a loop
     * @param array
     * @return sum of elements
     */
    public static int sumArrayLoop(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    /**
     * Method 2: Calculate sum using recursion
     * @param array
     * @param index
     * @return sum of elements
     */
    public static int sumArrayRecursive(int[] array, int index) {

        // Base case
        if (index == array.length) {
            return 0;
        }

        // Recursive case
        return array[index] + sumArrayRecursive(array, index+1);
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        // Create and initialize the array
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate sum using the loop method
        int sum1 = sumArrayLoop(numbers);

        // Calculate sum using the recursive method
        int sum2 = sumArrayRecursive(numbers, 0);

        // Display the array
        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Display results
        System.out.println("Sum using loop: " + sum1);
        System.out.println("Sum using recursion: " + sum2);
    }
}
