package Week07;
/**
 * The program asks the user to input multiple employees’ data and then displays payroll information 
 * 
 * @author Crispina Muriel
 */
import java.util.Scanner;
//import java.util.Arrays;

public class WeekPayroll {

	public static void main(String[] args) {
		/* Ask the user to input multiple employees’ data in the following form: 
		 * 
		 * String double double
		 * Example:
		 * Sam 19.75 40
		 */
		Scanner in = new Scanner(System.in);
		// use NUMBER_OF_EMPLOYEES constant to tell get all input from user
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
		String formattedGrossAmount = String.format("%.2f", grossPay[dataNeeded]);
		String formattedHoursAmount = String.format("%.2f", (double) hours[dataNeeded]);
		
		System.out.println("Employee: " + name[dataNeeded]);
		System.out.println("Hourly Wage: $" + formattedWageAmount);
		System.out.println("Hours Worked: " + formattedHoursAmount);
		System.out.println("Overtime Pay: $" + formattedOvertimeAmount);
		System.out.println("Gross Pay: $" + formattedGrossAmount);
		System.out.println("Tax: $" + tax[dataNeeded]);
		System.out.println("Net Pay: $" + netPay[dataNeeded]);
		if(dataNeeded < 2) System.out.println("------------------------");
		
	}
	/**
	 * Calculates net pay for each employee
	 * @param dataNeeded
	 * @param name
	 * @param wage
	 * @param hours
	 * @param overtimePay
	 * @param grossPay
	 * @param tax
	 * @param netPay
	 */

	private static void calculateNetPay(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay,
			double[] grossPay, double[] tax, double[] netPay) {
		double employeeNetPay = grossPay[dataNeeded-1] - tax[dataNeeded-1];
		netPay[dataNeeded-1] = employeeNetPay;
		
	}
	/**
	 * Calculates Taxes for each employee
	 * @param dataNeeded
	 * @param name
	 * @param wage
	 * @param hours
	 * @param overtimePay
	 * @param grossPay
	 * @param tax
	 */
	private static void calculateTax(int dataNeeded, String[] name, double[] wage, int[] hours, double[] overtimePay,
			double[] grossPay, double[] tax) {
		double taxRate = 0.15;
		double employeeTax = grossPay[dataNeeded-1] * taxRate;
		tax[dataNeeded-1] = Math.round(employeeTax * 100.0) / 100.0;
//		System.out.println(Arrays.toString(tax));
	}
	/**
	 * Calculates Gross Pay for each employee
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

	}


	/**
	 * getData method gets employee data as an input from the user 
	 * once the data is received the data is set in the data arrays located in main()
	 * @param dataNeeded - variable counting the current data we're recording
	 * @param name[] - array to hold all employee names
	 * @param wage[] - array to hold all employee wages
	 * @param hours[] - array to hold all employee hours
	 * @param Scanner utility to ask for userInput and get the data
	 */
	private static void getData(int dataNeeded, String[] name, double[] wage, int[] hours, Scanner in) {
		// ask userInput for next employee information "name, wage, hours"
		System.out.println("Enter employee " + dataNeeded + " data (name wage hours): ");
		
		// store the employee information given by user input
		String nextEmployeeName = in.next();
		double nextEmployeeWage = in.nextDouble();
		int nextEmployeeHours = in.nextInt();
		
		// store the employee information into the required arrays
		name[dataNeeded -1] = nextEmployeeName;
		wage[dataNeeded-1] = nextEmployeeWage;
		hours[dataNeeded-1] = nextEmployeeHours;
	}
	
	/**
	 * calculateOvertime method to take in employee hours 
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

	}
}
