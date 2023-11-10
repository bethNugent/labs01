package lab04;

import java.util.Scanner;

public class Lab4 {

	public void part1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the price of a bag please? ");
		int price = getInt(scanner);
		
		//Clear the scanner
		scanner.nextLine();
		
		System.out.println("How much money would you like to spend? ");
		int money = getInt(scanner);
		
		if (price < 0) {
			System.out.println("Price must be a positive number");
			return;
		}
		
		if (money <=0) {
			System.out.println("Money must be a positive number");
			return;
		}
		
		int numBags = money / price;
		
		System.out.println("If the price is " + price + "p and you have " + money + "p then you will be able to buy " + numBags + " bags.");
		
		scanner.close();
	}

	public static int getInt(Scanner scanner) {
		int result = scanner.nextInt();
		return result;
	}
}
