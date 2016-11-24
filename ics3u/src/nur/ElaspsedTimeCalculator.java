/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Halima Nur
 * November 23 2016
 *ElaspsedTimeCalculator.java
 *This program will give you the time it is.
 */
public class ElaspsedTimeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0");

		int hour;
		String time;
		int elapsed;
		double price = 0.0;

		
		
		System.out.println("Enter the starting hour:");
		hour= scan.nextInt();

		System.out.println("Enter am or pm:");
		time= scan.nextLine();
		scan.nextLine();
			
		System.out.println("Enter the amount of elapsed hours:");
		elapsed= scan.nextInt();
		
		if (hour+elapsed>=12){
			if(time.equals("am"));
			
		System.out.println("The time is: "+ df.format(hour +elapsed -12 ) +time);}
	
		
		
		
		
		}

	}


