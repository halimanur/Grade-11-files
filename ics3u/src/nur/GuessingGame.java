/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 *Halima Nur
 *November 11th 2016
 *GuessingGame.java
 *This program prints out a game played between the computer and a player.
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int correctguess;
		
		System.out.println("Enter a number between 1 and 20:");
		num= scan.nextInt();
	
		correctguess= (int)(Math.random()*19)+2;
		 
		if (correctguess==num)
			System.out.println("You Won!");
		
		if (num>correctguess)
			System.out.println("Better Luck next time");
		
		else
			System.out.println("Players number:" + num);
			System.out.println("Computers number:" + correctguess);
		   
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
