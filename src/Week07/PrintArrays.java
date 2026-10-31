package Week07;
import java.util.Arrays;

public class PrintArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create arrays
		int []numbers = integerCreateArray();
		String[]names = stringCreateArray();

		
		// Print arrays
		integerPrintArray(numbers);
		stringPrintArray(names);
		

	}
	public static int[] integerCreateArray() {
		int[] numbers = new int [5];
		for(int i = 0; i < 5; i++) {
			numbers[i] = i;
		}
		return numbers;
	}
	public static String[] stringCreateArray() {
		String[] names = {"Jennifer", "Todd", "Harry", "Baker", "Mark"};
		return names;
	}
	public static void integerPrintArray(int [] integerArray) {
		String name = "Jennifer";
		System.out.println(name);
		System.out.println(Arrays.toString(integerArray));
	}
	public static void stringPrintArray(String[] stringArray) {
		System.out.println(Arrays.toString(stringArray));
	}

}
