package Week09;
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
	 * @param boolean - isForPassingStudents, boolean to add logic to calculate PassingStudents
	*/ 
	public static double calculateStudentAverage(int[][] scores, int studentIndex, boolean isForPassingStudents) {
		int sum = 0;
		int[] currentStudentScores = scores[studentIndex];
		for(int i = 0; i < currentStudentScores.length; i++) {
			sum += currentStudentScores[i];
		}
		double studentAverage = (double) sum / 4.0;
		if(isForPassingStudents) {
			return studentAverage;
		} else {
			System.out.print("Student " + (studentIndex+1)+ ": ");
			System.out.printf("%.2f%n", studentAverage);
			return studentAverage;
		}

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
	public static int[] findHighestScore(int[][] scores) {
		int[] highestScoreDataArray = new int[3];
		int highest = scores[0][0];
		int highestStudent = 0;
		int highestExam = 0;
		
		for(int i = 0; i < scores.length; i++) {
			int[] currentStudent = scores[i];
			for(int j = 0; j < currentStudent.length; j++) {
				int currentStudentScore = currentStudent[j];
				if(currentStudentScore > highest) {
					highest = currentStudentScore;
					highestStudent = i;
					highestExam = j;
				}
			}
		}
		highestScoreDataArray[0] = highest;
		highestScoreDataArray[1] = highestStudent;
		highestScoreDataArray[2] = highestExam;
		return highestScoreDataArray;
	}
	/**
	 * countPassingStudents- method that calculates the number of students whose average is above 60;
	 * @param scores
	 * @return numberOfPassingStudents - integer of students whose average exam scores are above 60;
	 */
	private static int countPassingStudents(int[][] scores) {
		int numberOfPassingStudents = 0;
		for (int i = 0; i < scores.length; i++) {
			 double currentStudentAverage = calculateStudentAverage(scores, i, true);
			 if(currentStudentAverage > 60) {
				 numberOfPassingStudents++;
			 }
		}
		
		return numberOfPassingStudents;
	}

	public static void main(String[] args) {

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
			calculateStudentAverage(scores, i, false);
		}
		System.out.println();
		
		System.out.println("EXAM AVERAGES");
		for(int i = 0; i < 4; i++) {
			double currentExamAverage = calculateExamAverage(scores, i);
			System.out.print("Exam "+ (i+1)+ ": ");
			System.out.printf("%.2f%n", currentExamAverage);
		}
		System.out.println();
		
		System.out.println("HIGHEST SCORE");
		int[] highestScoreDataArray = findHighestScore(scores);
		int highestScore = highestScoreDataArray[0];
		int highestStudent = highestScoreDataArray[1];
		int highestExam = highestScoreDataArray[2];
		System.out.println("Highest score: "+ highestScore);
		System.out.println("Student: "+ (highestStudent+1) );
		System.out.println("Exam: " + (highestExam+1));
		System.out.println();
		
		System.out.println("PASSING STUDENTS");
		int numberOfStudentsPassing = countPassingStudents(scores);
		System.out.println("Passed: " + numberOfStudentsPassing);
		System.out.println("Did not pass: " + (5-numberOfStudentsPassing));
	}

}
