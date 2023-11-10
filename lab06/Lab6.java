package lab06;

import java.util.Scanner;

public class Lab6 {
			
//			public int getInt(String prompt, Scanner scanner) {
//				System.out.println(prompt);
//				int result = scanner.nextInt();
//				return result;
//			}
			
//create a method in Lab6 called part1()			
	public void part1(Scanner scanner) {
		grades(scanner);
		
	}

			
	public void grades(Scanner scanner) {
		
		String[] names = new String[5];
		int[] marks = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a name: ");
			names[i] = scanner.nextLine();
			
			System.out.println("Please enter a mark: ");
			marks[i] = scanner.nextInt();
			
			scanner.nextLine(); //clear scanner
			
		}
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int examMark = marks[i];
			String result = null;
			
			
			if (examMark < 1 || examMark > 100) {
				System.out.println("Error: marks must be between 1 and 100");
			} else if (examMark < 50) {
				System.out.println("Fail");
			} else if (examMark >= 50 && examMark <= 60) {
				System.out.println("Pass");
			} else if (examMark >= 61 && examMark <= 70) {
				System.out.println("Merit");
			} else if (examMark >= 71 && examMark <= 100) {
				System.out.println("Distinction");
			}
			
			System.out.printf("%s got %d marks and their result is: %\n", name, examMark, result);
		
		}
	}
	
	public void account(double initial, double target, double interest) {
		double current =  initial;
		int years = 0;
		
		while (current <= target) {
			current += (target * interest);
			years++;
		}
		
		System.out.printf("It would take %d years to go from £%.2f to £%.2f at an interesr rate of %.2f%", years, initial, target, interest);
	}

}
