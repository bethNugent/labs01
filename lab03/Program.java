package lab03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intResult = getInt("Please enter a number: ", scanner);
		
		//Clear the scanner
		scanner.nextLine();
		
		String strResult = getString("Please enter a string: ", scanner);
		
		System.out.println("Number is: " + intResult);
		System.out.println("String is: " + strResult);
		
		scanner.close();
	}

	public static int getInt(String prompt, Scanner scanner) {
		System.out.println(prompt);
		int result = scanner.nextInt();
		return result;
	}
	
	public static String getString(String prompt, Scanner scanner) {
		System.out.println(prompt);
		String result = scanner.nextLine();
		return result;
	}
}
