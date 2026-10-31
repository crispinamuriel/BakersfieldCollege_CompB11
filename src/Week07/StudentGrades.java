package Week07;

// Student Grades Program

import java.util.Scanner;
/**
 * A Program to enter students grades and do calculations
 */
public class StudentGrades {

	/**
	 * Method to enter grades into the array
	 * @param grades
	 * @param input
	 */
    public static void enterGrades(int[] grades, Scanner input) {

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
    }
    
    /**
     *  Method to display all grades
     * @param grades
     */
    public static void displayGrades(int[] grades) {

        System.out.println("\n----- Grades -----");

        for (int i = 0; i < grades.length;i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
    }

    /**
     * Method to calculate the average
     * @param grades
     * @return
     */
    public static double calculateAverage(int[] grades) {

        int total = 0;

        for (int i = 1; i < grades.length; i++) {
            total = total + grades[i];
        }

        return (double) total / grades.length;
    }

    /**
     * Method to find the highest grade
     * @param grades
     * @return
     */
    public static int findHighest(int[] grades) {

        int highest = grades[0];

        for (int i = 1; i < grades.length; i++) {

            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        return highest;
    }

    /**
     * Method to find the lowest grade
     * @param grades
     * @return
     */
    public static int findLowest(int[] grades) {

        int lowest = grades[0];

        for (int i = 1; i < grades.length; i++) {

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        return lowest;
    }

    /**
     * Method to count the number of students who passed
     * @param grades
     * @return
     */
    public static int countPassed(int[] grades) {

        int count = 0;
        final int PASSING_GRADE = 60;

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] >= PASSING_GRADE) {
                count++;
            }
        }

        return count;
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int numberOfStudents = input.nextInt();

        // Create the array
        int[] grades = new int[numberOfStudents];

        // Call methods
        enterGrades(grades, input);

        displayGrades(grades);

        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        int passed = countPassed(grades);

        // Display results
        System.out.println("\n----- Results -----");
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passed);

        input.close();
    }
}
