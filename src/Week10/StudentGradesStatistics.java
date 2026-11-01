package Week10;
/**
 * File Name: StudentGradesStatistics.java
 * Author: @author Crispina Muriel
 * Course: COMPB11 - 73478
 * Date: October 31, 2026
 * Description: Java program named StudentGradesStatistics.java that reads the raw data
 * of 30 students stored in a text file named grades.txt and save the data in arrays.
 */
// imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradesStatistics {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// Create Array to store read data from file
		ArrayList<String[]> students = new ArrayList<>();
		// Create Array to store processed data from method calculations
		ArrayList<String[]> averageResults = new ArrayList<>();
		// Use arrays to store the data that is read from the file and to store the results of processing
		ArrayList<String[]> subjectAveResults = new ArrayList<>();
		// Psudocode:
		
		// declare input file & use File to wrap grades.txt
	    File inputFile = new File("grades.txt");
		// declare scanner to scan file
	    Scanner in = new Scanner(inputFile);
		// declare printwriter to write to output file
	    PrintWriter out = new PrintWriter("report.txt");
		// use a while loop and check if there the file has a nextLine and 
		// continue looping as long as there is another input line
	    while (in.hasNextLine()) {
	    	// Read entire next line and store it in a String
	    	String line = in.nextLine();
	    	// create a scanner to read the line
	    	Scanner lineScanner = new Scanner(line);
	    	// use a while loop to read each token in line
	    		// be sure that each array is filled with only one student's info
	    		// put each line into the array
	    		students.add(line.split(" "));
	    		lineScanner.close();
	    }
//    	for(int i = 0; i < students.size(); i++) {
//    		System.out.print(Arrays.toString(students.get(i)));
//    	}
		
		//3- Calculate the following:
		// Create calculateAverage - method that calculates the average grade for each student
        calculateAverage(students, averageResults);
        // loop averageResults for report print
        // Create printAverage - method that prints the calculated average grade for each student
        printAverage(averageResults, out);
        
		// Create calculateAndPrintSubjectAverage - method that calculates the subjects’ averages for all 30 students
        calculateAndPrintSubjectAverage(students, out);
		// Create calculateClassAverage - method that calculates the class average
        calculateAndPrintClassAverage(students,out);
		// Create calculateAndPrintHighestGrade - method that calculates the highest grade awarded
        calculateAndPrintHighestGrade(students,out);
		// Create calculateAndPrintLowestGrade - method that calculates the lowest grade awarded
        calculateAndPrintLowestGrade(students,out);
		// Create calculateAndPrintHighestAverageStudent - method that calculates the Highest Average Student
        calculateAndPrintHighestAverageStudent(students,out);
		// Create calculateAndPrintLowestAverageStudent - method that calculates the Lowest Average Student
        calculateAndPrintLowestAverageStudent(students,out);
		// Create calculateAndPrintPassingGradeRate - method that calculates the percentage of Passing grades
        calculateAndPrintPassingGradeRate(students,out);
		//(grades < 60 are failing grades)
		// Create calculateAndPrintPassingStudentRate - method that calculates the percentage of passing students (out of 30)
        calculateAndPrintPassingStudentRate(students,out);
    	// Results will be printed in a text file (report.txt) and must be formatted nicely
    	
    	// Close files when done
    	in.close();
        out.close();
               
	}
	private static void calculateAndPrintSubjectAverage(ArrayList<String[]> students, PrintWriter out) {
		// create totals for each subject 1-5
		double subject1 = 0;
		double subject2 = 0;
		double subject3 = 0;
		double subject4 = 0;
		double subject5 = 0;
		// loop students
		for(int i = 0; i < students.size(); i++) {
		// add each score to appropriate subject
			for(int j = 2; j < students.get(i).length; j++) {
				int currentScore = Integer.parseInt(students.get(i)[j]);
				
				if(j == 2) subject1+= currentScore;
				if(j == 3) subject2+= currentScore;
				if(j == 4) subject3+= currentScore;
				if(j == 5) subject4+= currentScore;
				if(j == 6) subject5+= currentScore;
			}
		}
		
		// average is total divided by 30 students for each of the five subjects
		double averageSubject1 = subject1 / 30;
		double averageSubject2 = subject2 / 30;
		double averageSubject3 = subject3 / 30;
		double averageSubject4 = subject4 / 30;
		double averageSubject5 = subject5 / 30;
		out.println("---------------------------");
		out.printf("%-22s%.2f%%%n", ("Subject 1 Average:"), averageSubject1);
		out.printf("%-22s%.2f%%%n", ("Subject 2 Average:"), averageSubject2);
		out.printf("%-22s%.2f%%%n", ("Subject 3 Average:"), averageSubject3);
		out.printf("%-22s%.2f%%%n", ("Subject 4 Average:"), averageSubject4);
		out.printf("%-22s%.2f%%%n", ("Subject 5 Average:"), averageSubject5);
		out.println("---------------------------");

		
	}
	// Method to print the average of each student
	public static void printAverage(ArrayList<String[]> averageResults, PrintWriter out) {
		out.println("Student Name        Average");
		out.println("---------------------------");
		for(int i = 0; i < averageResults.size(); i++) {
        	String[] myArray = averageResults.get(i);
        	double myDouble = Double.parseDouble(myArray[2]); 
        	out.printf("%-21s%.2f%%%n",(myArray[0] +" " + myArray[1] + ": " ), myDouble);

        }
	}

	public static void calculateAverage(ArrayList<String[]> students, ArrayList<String[]>averageResults) {
		// loop over students
		for(int i = 0; i < students.size(); i++) {
			// for each student you want a result array
			String[] student = new String[3];
			// for each student you want to keep a total
			int total = 0;
			// add the student name and the average into the result array
			student[0] = students.get(i)[0];
			student[1] = students.get(i)[1];
			for(int j = 2; j < students.get(i).length; j++) {
				String currentData = students.get(i)[j];
				
				total += Integer.parseInt(currentData);
			}
			double average = (double) total / 5;
			String stringAverage = String.valueOf(average);
			student[2] = stringAverage;
			averageResults.add(student);
		}
		
	}
	   	
		/*
		 * Objective
           Write a Java program named StudentGradesStatistics.java that reads the raw data
           of 30 students stored in a text file named grades.txt and save the data in arrays. 
           Process the data and save the results in a text file named report.txt.
           The data for each student is stored in the text file in this format:
           [first-name] [last-name] [grade1] [grade2] [grade3] [grade4] [grade5]
			OUTPUT:
			
			Student Name Average
			Mary Smith: 86.80%
			: (list all 30 students)
			Subject 1 Average: 83.47%
			: (list all 5 subjects)
			Class Average: 76.25%
			Highest grade: 99
			Lowest grade: 56
			Highest average: Mary Thomas (93.05%)
			Lowest average: John Smith (59.80%)
			Passing grades rate: 138/150 (92.00%)
			Passing student rate: 25/30 (83.33%)
		 */

}



