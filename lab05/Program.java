package lab05;

import java.util.Scanner;

public class Program {

	//program class contains the 'main' method
	//create an instance of the 'Lab5' class and call it's 'grades' method
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Lab5 lab5 = new Lab5();
		lab5.grades(scanner);
		
		scanner.nextLine(); //clear scanner
		
		lab5.part2(scanner);
		
		scanner.close();
	}

}
