package Week07;
import java.util.Scanner;


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number N to count down from: ");
		int n = in.nextInt();
		System.out.println("N = " + n);
		recursiveCountDown(n);
		in.close();
	}
	public static void recursiveCountDown(int n) {
		// base case
		if(n == 0) System.out.println(0);
		
		// recursive case
		else {
			System.out.println(n);
			recursiveCountDown(n-1);
		}
	}


}
