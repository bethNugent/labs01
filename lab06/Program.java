package lab06;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//create an instance of Lab6 in the main() and call the grades method to get ready for the rest of this exercise
		Lab6 lab6 = new Lab6();
		lab6.part1(scanner);
		
		
//		scanner.nextLine(); //clear scanner
//		
//		lab5.part2(scanner);
		
		scanner.close();

}
}

