package Week09;


public class ArrayPractice {
	
	public static void main(String[] args) {
		int currentSize = 5;
		int [] numbers = {44, 2, 3, 4, 5};
		int [] newNumbers = new int [currentSize];
		
		
		// Enhanced for loop
//		for(int element: numbers) {
////			System.out.println(element);
//		}
//		System.out.println(Arrays.toString(newNumbers));
		for(int i = 0; i < currentSize; i++) {
			newNumbers[i] = numbers[i];
		}
//		System.out.println(Arrays.toString(newNumbers));
		
		// removing(??) an element in an unordered array
		newNumbers[0] = newNumbers[newNumbers.length -1];
		currentSize--;
//		System.out.println(Arrays.toString(newNumbers));
		int [] blankArray = new int [currentSize];
		for(int i = 0; i < currentSize; i++) {
			blankArray[i] = newNumbers[i];
		}
//		System.out.println(Arrays.toString(blankArray));
//		System.out.println(currentSize);
		
		// removing an element in an ordered array
		int pos = 1;
//		int orderedSize = 5;
		int [] ordered = {1,2,3,4,5};
//		System.out.println(Arrays.toString(ordered));
		for(int i = pos + 1; i < ordered.length; i++) {
			ordered[i - 1] = ordered[i]; 
		}
//		orderedSize--;
//		System.out.println(Arrays.toString(ordered));
		
		
		int [][] matrix = {{1,2,3},
						   {4,5,6},
						   {7,8,9}
						};
//		System.out.println(Arrays.toString(matrix));
		for(int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
		}
		
		for(int[] array:matrix) {
			for(int value:array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
//		double sumForMyArray = 0;
		
//		double [] averageArray = {5.75, 5.33, 6.10, 5.45, 5.88};
		
//		for(double value:averageArray) {
//			sumForMyArray += value;
//		}
//		System.out.println(sumForMyArray);
//		System.out.println(sumForMyArray / averageArray.length);
//		double averageForMyArray = sumForMyArray / averageArray.length;
//		System.out.printf("Average: %.2f", averageForMyArray);
	}
	
	// Write a program that calculates the most expensive 
	// and least expensive items in an array of items' prices
	// The prices are stored in an array as follows:
	// 50.75, 15.35, 36.99, 12.00, 43.00, 17.99
	
//	double [] myDoubleArray = { };
//	double maxValue = myDoubleArray[0];
//	double minValue = myDoubleArray[0];
//	
//	for(double myValue:myDoubleArray) {
//		
//	}
//	
	
	
	
	
}
