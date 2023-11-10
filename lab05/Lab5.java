package lab05;

import java.util.Scanner;

public class Lab5 {
		
		public int getInt(String prompt, Scanner scanner) {
			System.out.println(prompt);
			int result = scanner.nextInt();
			return result;
		}

		public static String getString(String prompt, Scanner scanner) {
			System.out.println(prompt);
			String result = scanner.nextLine();
			return result;
		}

		
public void grades(Scanner scanner) {
	
	int examMark = getInt("Please enter your exam mark (1-100): ", scanner);
	
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
	
}
	

public void part2(Scanner scanner) {
	
	boolean isSummer = getString("Is it Summer time? (yes/no)", scanner).equalsIgnoreCase("yes");

	boolean isEarlyEvening = getString("Is it early evening? (yes/no)", scanner).equalsIgnoreCase("yes");
	
	
	if (isSummer) {
		System.out.println("Take a shower");
		System.out.println("Do outdoors hobby");
		System.out.println("Contact friends");
		
		if (isEarlyEvening) {
			System.out.println("Eat outside");
		} else {
		System.out.println("Eat inside");
		}
	} else {
		System.out.println("Take a shower");
		System.out.println("Eat inside");
		System.out.println("Contact friends");
		
	if (isEarlyEvening) {
		System.out.println("Take a walk");
	}
}
}

}
