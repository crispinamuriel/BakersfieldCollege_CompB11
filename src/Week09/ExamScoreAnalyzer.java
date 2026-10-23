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
	
	/**
	 * Method displayScores() displays student scores in a formatted table 
	 * @param scores - 2D array with 5 students and 4 exam scores for each student
	 */
	public static void displayScores(int[][] scores) {
		System.out.println("Student     Exam 1  Exam 2  Exam 3  Exam 4");
		for (int i = 0; i < scores.length;i++) {
			System.out.print("Student " + (i+1) + "       ");
			int[] studentScores = scores[i];
			for(int j = 0; j < studentScores.length; j++) {
				System.out.print(studentScores[j] + "      ");
			}
			System.out.println();
		}
	}
	
	/** 
	 * Method calculateStudentAverage() calculates student's average score,
	 * and displays each student's average to two decimal places.
	 * @param scores - 2D array with 5 students and 4 exam scores for each student
	 * @param studentIndex - the index of the student we are calculating the average of
	*/ 
	public static void calculateStudentAverage(int[][] scores, int studentIndex) {
		System.out.print("Student " + (studentIndex+1)+ ": ");
		int sum = 0;
		int[] currentStudentScores = scores[studentIndex];
		for(int i = 0; i < currentStudentScores.length; i++) {
			sum += currentStudentScores[i];
		}
		double studentAverage = (double) sum / 4.0;
		System.out.printf("%.2f%n", studentAverage);
	}
	/**
	 * calculateExamAverage() - Calculate each exam's class average
	 * @param scores - 2D array with 5 students and 4 exam scores for each student
	 * @param examIndex - index of the exam to calculate the average of
	 * @return average - returns the average score for that exam across all students
	 */
	public static double calculateExamAverage(int[][] scores, int examIndex) {
		double averageScore = 0;
		
		for(int i = 0; i < scores.length; i++) {
			int[] studentScores = scores[i];
			for(int j = 0; j < studentScores.length; j++) {
				if(j == examIndex) {
					averageScore += studentScores[j];
				}
			}
		}
		double examAverage = (double) averageScore / 5.0;
		return examAverage;
	}
	/**
	 * findHighestScore() - Method that finds and returns the highest score in
		the entire array
	 * @param scores - 2D array with 5 students and 4 exam scores for each student
	 * @return highest - integer highest score in the entire array of student exam scores
	 */
	public static void findHighestScore(int[][] scores) {
		// TODO Auto-generated method stub
		int highest = scores[0][0];
	}

	public static void main(String[] args) {
		/* TODO 
		 *  formatted table (use printf() method )
			
		4. Find the highest score
		Write a method named findHighestScore() that finds and returns the highest score in
		the entire array.
		Also display the student number and exam number where the highest score occurred. If
		the highest score occurs more than once, displaying the first occurrence is sufficient
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
		System.out.println();
		System.out.println("STUDENT AVERAGES");
		for(int i = 0; i < scores.length; i++) {
			calculateStudentAverage(scores, i);
		}
		System.out.println();
		
		System.out.println("EXAM AVERAGES");
		for(int i = 0; i < 4; i++) {
			double currentExamAverage = calculateExamAverage(scores, i);
			System.out.print("Exam "+ (i+1)+ ": ");
			System.out.printf("%.2f%n", currentExamAverage);
		}
		findHighestScore(scores);
		
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
