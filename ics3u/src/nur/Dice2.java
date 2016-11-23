/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * November 16th 2016
 * Dice2.java
 * This program 
 *
 */
public class Dice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int die1;
		int die2;
		int counter = 0; 
		
		die1= (int)(Math.random()*11)+1;
		die2= (int)(Math.random()*11)+1;
		while (counter<=1){
		

		if (die1>die2){
			System.out.println("You Won!");
		counter= 2;
		} 	
		else if (die1 < die2) 
			   System.out.println("You Lose");
		else if (die1 == die2)
			   System.out.println("It's a tie");
		
		System.out.println("Do you want to play again?");
			String yesno= scan.nextLine();	
		
			
		}
	}
	}

