package Java_lab_4;

import java.util.Scanner;

public class fourth_lab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		String userInput;
		

		do {
			System.out.println("Learn your squares and cubes!");
			System.out.println("\nPlease enter an integer: ");
			userNum = scnr.nextInt();

			System.out.printf("%-7s %-8s %-7s\n","Number", "Squared", "Cubed");
			System.out.printf("%-7s %-8s %-7s\n","=======", "=======", "======");

			for (int i = 1; i <= userNum; i++) {
				int square = i * i;
				int cube = i * i * i;
				System.out.printf("%-7s %-8s %-7s\n", i, square, cube);
			}

			System.out.println("\nWould you like to continue (y/n)?");
			userInput = scnr.next();
			
		} while (userInput.equals("y"));

		System.out.println("Goodbye!");
		scnr.close();
	}
}
