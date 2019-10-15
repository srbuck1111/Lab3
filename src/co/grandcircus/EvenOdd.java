package ca.grandcircus;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int madCounter = 0;
		
		boolean retry = false;
		
		String ans = "N/A";

		System.out.print("Name? : ");
		String name = scan.next();

		do {

			madCounter = 0;
			
			do {

				switch (madCounter) {
				case 1:
				case 2:
					System.out.print(name + ", enter an integer between 1-100: ");
					break;
				case 3:
				case 4:
					System.out.print(name.toUpperCase() + ", ENTER AN INTEGER BETWEEN 1-100: ");
					break;
				case 5:
					System.out.println(name + ".");
					break;
				case 6:
					System.out.println("One more try, " + name + ".");
					break;
				case 7:
					System.out.println("I'm done.");
					System.exit(0);
					break;
				default:
					System.out.print("Enter an integer between 1-100: ");
					break;
				}

				num = scan.nextInt();

				if (num >= 1 && num <= 100) {

					if (num % 2 == 1) {

						if (num > 60) {

							System.out.println(num + " Odd and over 60");

						} else {

							System.out.println("Odd");

						}

					} else {

						if (num > 60) {

							System.out.println(num + " Even");

						} else if (num > 25) {

							System.out.println("Even");

						} else {

							System.out.println("Even and less than 25");

						}

					}

				}

				madCounter++;

			} while (num < 1 || num > 100);
			
			scan.nextLine(); //garbage line
			
			System.out.println("Again (Y/N)");
			ans = scan.next();
			
			if (ans.equalsIgnoreCase("Y")) {
				
				retry = true;
				
			} else {
				
				retry = false;
				
			}

		} while (retry);

		System.out.println("Goodbye.");

		scan.close();

	}

}
