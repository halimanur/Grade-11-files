/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * November 15th 2016
 * GuessingGame2.java
 *This program will tell you to choose a number and tell you if you got the correct one or if you need to try again. 
 */
public class GuessingGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int guesses;
		int counter = 0; 
		
		guesses= (int)(Math.random()*20)+1;
		while (counter<=1){
		
		System.out.println("Enter a number between 1 and 20:");
		num= scan.nextInt();

		
		 
		if (num==guesses){
			System.out.println("You Won!");
		counter= 2;
		}
		else{
			System.out.println("Try again");
		
	
			 
		
		}
	}
	}
}
