/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * Random.java
 * November 09 2016
 *This program 
 */
public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int die1;
		int die2;
		
		die1= (int)(Math.random()*11)+1;
		die2= (int)(Math.random()*11)+1;
		
		if (die1>die2)
		   System.out.println("You Won!");
		   	
		   	else if (die1 < die2) 
		   System.out.println("You Lose");
	   
		   else if (die1 == die2)
		   System.out.println("It's a tie");

	}

}
