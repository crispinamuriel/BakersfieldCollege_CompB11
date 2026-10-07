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
		// integer array for employee hours
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
			calculateOvertime(dataNeeded, name, wage, hours, overtimePay);
			calculateGrossPay(dataNeeded,name, wage, hours, overtimePay, grossPay);
			calculateTax(dataNeeded, name, wage, hours, overtimePay, grossPay, tax);
			calculateNetPay(dataNeeded, name, wage, hours, overtimePay, grossPay, tax, netPay);
			
			// call all methods like getData() until dataNeeded is equal to NUMBER_OF_EMPLOYEES
			dataNeeded++;
			// when dataNeeded hits number of employees, turn the while loop off
			if(dataNeeded > NUMBER_OF_EMPLOYEES) gettingEmployees = false;
		}
		// data fetch is over, print out display to user
		System.out.println("------------------------");
		for(int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
//			System.out.print(i);
			displayPayroll(i, name, wage, hours, overtimePay, grossPay, tax, netPay);
		}
	}
	/**
	 * Method to display payroll information
	 * @param dataNeeded
	 * @param name
	 * @param wage
	 * @param hours
	 * @param overtimePay
	 * @param grossPay
	 * @param tax
	 * @param netPay
	 */
	private static void displayPayroll(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay,
			double[] grossPay, double[] tax, double[] netPay) {
		// format the amounts correctly before print
		String formattedOvertimeAmount = String.format("%.2f", overtimePay[dataNeeded]);
		String formattedWageAmount = String.format("%.2f", wage[dataNeeded]);
		
		System.out.println("Employee: " + name[dataNeeded]);
		System.out.println("Hourly Wage: $" + formattedWageAmount);
		System.out.println("Hours Worked: " + hours[dataNeeded]);
		System.out.println("Overtime Pay: $" + formattedOvertimeAmount);
		System.out.println("Gross Pay: $" + grossPay[dataNeeded]);
		System.out.println("Tax: $" + tax[dataNeeded]);
		System.out.println("Net Pay: $" + netPay[dataNeeded]);
		System.out.println("------------------------");
		
	}


	private static void calculateNetPay(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay,
			double[] grossPay, double[] tax, double[] netPay) {
		double employeeNetPay = grossPay[dataNeeded-1] - tax[dataNeeded-1];
		netPay[dataNeeded-1] = employeeNetPay;
//		System.out.println(Arrays.toString(netPay));
		
	}
	private static void calculateTax(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay,
			double[] grossPay, double[] tax) {
		double taxRate = 0.15;
		double employeeTax = grossPay[dataNeeded-1] * taxRate;
		tax[dataNeeded-1] = Math.round(employeeTax * 100.0) / 100.0;
//		System.out.println(Arrays.toString(tax));
	}
	/**
	 * 
	 * @param dataNeeded - to get the index number in the employee arrays
	 * @param name - holds all the names
	 * @param wage - array holding all wages
	 * @param hours - array holding all hours worked
	 * @param overtimePay - array holding all overtime pay
	 * @param grossPay - array of gross pay which is calculated in this method
	 */
	private static void calculateGrossPay(int dataNeeded, String[] name, double[] wage, int[] hours,
			double[] overtimePay, double[] grossPay) {
		if(hours[dataNeeded-1] > 40) {
			double employeeGrossPay =(wage[dataNeeded -1] * 40) + overtimePay[dataNeeded -1];
			grossPay[dataNeeded -1] = Math.round(employeeGrossPay * 100.0) / 100.0;
		} else {
			double employeeGrossPay = (wage[dataNeeded -1] * hours[dataNeeded-1]) + overtimePay[dataNeeded -1];
			grossPay[dataNeeded -1] = Math.round(employeeGrossPay * 100.0) / 100.0;
		}

		
//		System.out.println(Arrays.toString(grossPay));
//		System.out.printf("%.2f%n", grossPay[dataNeeded - 1]);
	}


	/**
	 * getData is a method to get the data as an input from the user 
	 * once the data is received the data is set in the arrays located in main()
	 * @param dataNeeded - variable counting the current data we're recording
	 * @param name[] - array to hold all employee names
	 * @param wage[] - array to hold all employee wages
	 * @param hours[] - array to hold all employee hours
	 * @param Scanner utility to ask for userInput and get the data
	 */
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
//		System.out.println(Arrays.toString(name));
	}
	
	/**
	 * calculateOvertime is a method to take in employee hours 
	 * and calculate any overtime over 40 hours worked.
	 * @param dataNeeded - tells us what employee we're on
	 * @param name - array to hold all employee names
	 * @param wage - array to hold all employee wages
	 * @param hours - array to hold all employee hours
	 * @param overtimePay - array to hold all employee overtime
	 */
	private static void calculateOvertime(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay) {
		double timeAndHalf = 1.5;
		int employeeHours = hours[dataNeeded-1];
		double employeeWage = wage[dataNeeded-1];
		if(employeeHours-40 < 0 ) {
			overtimePay[dataNeeded - 1] = 0;
		} else {
			overtimePay[dataNeeded - 1] = timeAndHalf * employeeWage * (employeeHours-40);
		}

//		System.out.print(Arrays.toString(overtimePay));
	}
}
