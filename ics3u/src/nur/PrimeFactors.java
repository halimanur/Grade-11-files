/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * PrimeFactors.java
 * November 14th 2016
 * This program prints the factors of the number you input
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int number;

	System.out.println("Enter a Number");
	number= scan.nextInt();
	
	int counter = 2;
	
	while (counter<= number){
		
	if	(number%counter==0){
		System.out.println(counter);
		number= number/counter;
	}
		else
			counter= counter+1;
	}
		
	}
	

}
