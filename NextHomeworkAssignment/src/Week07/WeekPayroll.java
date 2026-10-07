package Week07;
/**
 * The program asks the user to input multiple employees’ data in the following form: 
 * 
 * String double double
 * 
 * Example:
 * Sam 19.75 40
 * 
 * Sam is the first name of an employee, 19.75 is the hourly wage Sam receives, 
 * and 40 is the number of hours Sam worked last week.
 * 
 * The program reads multiple employees’ data depending on the number of employees
 * declared in a constant in the main() method named NUMBER_OF_EMPLOYEES.
 * 
 * The employees’ data that was read is stored in three arrays declared in the
 * main() method: name[], wages[], and hours[]
 * 
 * Four new arrays are declared in the main() method to be used to calculate the:
 * 
 * overtime, 
 * the gross pay, 
 * the tax deduction, 
 * and the net pay
 * 
 * Four arrays are named: 
 * overtimePay[],
 * grossPay[], 
 * tax[], and 
 * netPay[]
 * 
 * Calculation Rules:
 *	1- Overtime pay is paid for any hours worked over 40 will be paid at 1.5X wage. 
 *	OVERTIME_RATE constant declared in main() and used for the overtime rate.
 *	2- Tax deduction is calculated based on 1.5% of the gross pay. TAX_RATE constant declared
 *	in main() and used for the tax rate.
 *	3- Constant to hold the number of employees named NUMBER_OF_EMPLOYEES
 *	and used to create the arrays in the main() method.
 * 
 * @author Crispina Muriel
 */
import java.util.Scanner;
import java.util.Arrays;

public class WeekPayroll {

	public static void main(String[] args) {
	
		/* Use Scanner to ask the user to input multiple employees’ data in the following form: 
		 * 
		 * String double double
		 * 
		 * Example:
		 * "Enter name of employee, hourly wage, and number of hours worked." =>
		 * Sam 19.75 40
		 */
		Scanner in = new Scanner(System.in);
		// use NUMBER_OF_EMPLOYEES constant to tell if we have all input from user
		int NUMBER_OF_EMPLOYEES = 3;
		int dataNeeded = 1;
		boolean gettingEmployees = true;
		
		// data arrays
		
		// String array for employee name
		String[] name = new String[NUMBER_OF_EMPLOYEES];
		// double array for employee wage
		double[] wage = new double[NUMBER_OF_EMPLOYEES];
		// int array for employee hours
		int [] hours = new int[NUMBER_OF_EMPLOYEES];
		
		// calculation arrays
		// overtimePay
		double [] overtimePay = new double[NUMBER_OF_EMPLOYEES];
		// gross pay
		double [] grossPay = new double [NUMBER_OF_EMPLOYEES];
		//tax
		double [] tax = new double [NUMBER_OF_EMPLOYEES];
		//net pay
		double [] netPay = new double [NUMBER_OF_EMPLOYEES];
		
		// FORMATTING CONSOLE TO LOOK LIKE PROMPT
		System.out.println("Employees Weekly Payroll");
		System.out.println("------------------------");
		
		while (gettingEmployees) {
			getData(dataNeeded, name, wage, hours, in);
			// ask until dataNeeded is equal to NUMBER_OF_EMPLOYEES
			dataNeeded++;
			// when dataNeeded hits zero, turn the while loop off
			if(dataNeeded > NUMBER_OF_EMPLOYEES) gettingEmployees = false;
		}
		// data fetch is over, print out display to user
		System.out.println("------------------------");
	}

	private static void getData(int dataNeeded, String[] name, double[] wage, int[] hours, Scanner in) {
		// ask userInput for next employee info "name, wage, hours"
		System.out.println("Enter employee " + dataNeeded + " data (name wage hours): ");
		
		// store the employee info given by user input
		String nextEmployeeName = in.next();
		double nextEmployeeWage = in.nextDouble();
		int nextEmployeeHours = in.nextInt();
		
		// store the employee info into the required arrays
		name[dataNeeded -1] = nextEmployeeName;
		wage[dataNeeded-1] = nextEmployeeWage;
		hours[dataNeeded-1] = nextEmployeeHours;
		System.out.println(Arrays.toString(name));
	}
}
