package lab03_2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		theLunchQueue();
	}
	
	public static void theLunchQueue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What main dish would you like (Fish, Burgers or veg)?");
		String mainCourse = getString(scanner);
		
		int roastPotatoes = getInt("How many roast potatoes would you like?");
		int brusselSprouts = getInt("How many brussel sprouts would you like?");
		
		System.out.println("Hellow, your lunch is " + mainCourse + " with " + roastPotatoes + " roast potatoes and " + brusselSprouts + " brussel sprouts.");
		
		scanner.close();
	}

	public static String getString(Scanner scanner) {
		return scanner.nextLine();
	}
	
	public static int getInt(String prompt) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(prompt);
		return scanner.nextInt();
		
		
	}
}
