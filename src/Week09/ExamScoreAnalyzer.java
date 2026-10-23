package Week09;

/*
 * Helping notes:
✓ ✓ Use two indices to locate a specific grade, for example: scores[student][exam]
✓ Remember, an index starts with 0, while student# and exam# starts with 1 (adjust the
print value of the index)
✓ Use nested loops to traverse the 2D array values
✓ Use printf() method for a better printout of the table, as well as for printing two decimal
digits for the averages.
 */

/**
 * File Name: ExamScoreAnalyzer.java
 * Author: @author Crispina Muriel
 * Course: COMPB11 - 73478
 * Date: October 23,2026
 * Description: Java program named ExamScoreAnalyzer.java that analyzes the exam scores of
five students who took four exams
 * 
 */

public class ExamScoreAnalyzer {
	
	public static void displayScores(int[][] scores) {
		for (int[] studentScores: scores) {
			for(int examScore: studentScores) {
				System.out.print(examScore);
			}
		}
	}

	public static void main(String[] args) {
		/* TODO 
		 *  Store and display the scores
			• Declare and initialize a two-dimensional integer array containing the scores above.
			• Write a method named displayScores() that displays the scores in a formatted
			table (use printf() method ).
			• Include a student label and an exam label for each column
		*/
		
		// Two-dimensional integer array for scores of 5 students during 4 tests
		int[][] scores = {
			    {85, 90, 78, 92}, 
			    {70, 65, 80, 75}, 
			    {95, 88, 91, 96}, 
			    {55, 60, 58, 62}, 
			    {80, 75, 85, 70}  
			};
		System.out.println("EXAM SCORE ANALYZER");
		System.out.println();
		displayScores(scores);
		// Expected output example below:
		/*
		 * EXAM SCORE ANALYZER
		 * 
		   Student Exam 1 Exam 2 Exam 3 Exam 4
		   Student 1 85 90 78 92
		   Student 2 70 65 80 75
		   Student 3 95 88 91 96
		   Student 4 55 60 58 62
		   Student 5 80 75 85 70
		   
		   STUDENT AVERAGES
		   Student 1: 86.25
		   Student 2: 72.50
		   Student 3: 92.50
		   Student 4: 58.75
		   Student 5: 77.50
		   
		   EXAM AVERAGES
		   Exam 1: 77.00
		   Exam 2: 75.60
		   Exam 3: 78.40
		   Exam 4: 79.00
		   
		   HIGHEST SCORE
		   Highest score: 96
		   Student: 3
		   Exam: 4
		   
		   PASSING STUDENTS
		   Passed: 4
		   Did not pass: 1
		 * 
		 * 
		 * 
		 */

	}

}
