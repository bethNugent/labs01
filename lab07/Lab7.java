package lab07;

public class Lab7 {
	public void start() {
		//Declare an array of integers
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		//Find the sum of every number in numbers
		int sum = findSum(numbers);
		System.out.println("Sum of numbers: " + sum);
		
		//Find the average of these numbers
		double average = findAverage(numbers);
		System.out.println("Average of numbers: " + average);
		
		//Find the minimum number in numbers
		int min = findMinimum(numbers);
		System.out.println("Minimum number: " + min);
		
		//find the maximum number in numbers
		int max = findMaximum(numbers);
		System.out.println("Maximum number: " + max);
		
		//find the zero index in numbers
		int zeroIndex = findZeroIndex(numbers);
		System.out.println("Index of zero: " + zeroIndex);
		
	}
	
	
	
	//Method to find sum of every number in numbers
	public int findSum(int[] arr) {
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//method to find the average of numbers using sum of
	public double findAverage(int[] arr) {
		int sum = findSum(arr);
		return (double) sum / arr.length;
	}
	
	//method to find the minimum of numbers
	public int findMinimum(int[] arr) {
		int min = arr[0];
		for (int i =1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//method to find the maximum of numbers
	public int findMaximum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//method to find zero index of numbers
	public int findZeroIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return i;
			}
		}
		return -1;
	}

}
