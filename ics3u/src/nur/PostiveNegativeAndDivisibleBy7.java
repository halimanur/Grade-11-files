/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * java.PostiveNegativeAndDivisibleBy7
 * October 31th 2016
 * This program prints out if the number you enter is positive or negative and if its divisible by 7.
 */
public class PostiveNegativeAndDivisibleBy7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number;

		System.out.println("Enter a Number");
		number= scan.nextInt();

		if (number>0)
			System.out.println("Your number is postive");

		else
			System.out.println("Your number is negative");

		if (number%7==0){
			System.out.println("Your number is divisable by 7");
		}

		else 

			System.out.println("Your number is not divisable by 7");










	}

}
