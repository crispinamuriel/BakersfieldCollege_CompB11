package Week10;
/**
 * File Name: StudentGradesStatistics.java
 * Author: @author Crispina Muriel
 * Course: COMPB11 - 73478
 * Date: October 31, 2026
 * Description: Java program named StudentGradesStatistics.java that reads the raw data
 * of 30 students stored in a text file named grades.txt and save the data in arrays.
 */

public class StudentGradesStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Objective
           Write a Java program named StudentGradesStatistics.java that reads the raw data
           of 30 students stored in a text file named grades.txt and save the data in arrays. 
           Process the data and save the results in a text file named report.txt.
           The data for each student is stored in the text file in this format:
           [first-name] [last-name] [grade1] [grade2] [grade3] [grade4] [grade5]

		 */
		// Psudocode:
		// use File to wrap grades.txt
		// declare scanner to scan file
		// declare printwriter to write to output file
		
		// use a while loop and check if there the file has a nextLine and 
		   // continue looping as long as there is another input line
		// Read entire next line and store it in a String
		// Create an empty String to store the student’s name
		//1- Use arrays to store the data that is read from the file and to store the results of processing
		//2- Results will be printed in a text file (report.txt) and must be formatted nicely
		//3- Calculate the following:
		// Create calculateAverage - method that calculates the average grade for each student
		// Create calculateSubjectAverage - method that calculates the subjects’ averages for all 30 students
		// Create calculateClassAverage - method that calculates the class average
		// Create calculateHighestGrade - method that calculates the highest grade awarded
		// Create calculateLowestGrade - method that calculates the lowest grade awarded
		//6. Highest Average Student.
		//7. Lowest Average Student.
		//8. Passing grade rate.
		//(grades < 60 are failing grades)
		//9. Passing student rate.
		//4- Use methods
		//5- Close files when done

	}

}
