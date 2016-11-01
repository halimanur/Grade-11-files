/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Halima Nur\
 * October 31 2016
 * PrintingApplication.java
 * This program prints out how many items you purchased.
 */
public class PrintingApplication {


	/**
	 * @param args
	 */	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");

		int number;

		System.out.println("Enter number of copies being printed.");
		number= scan.nextInt();
		
		{
		if (number<99){
		System.out.println("Price per copy is 0.30");
		System.out.println("you total is: "  + df.format (0.30*number));
	    }
	
	    else if (number<499){
		System.out.println("Price per copy is 0.28");	
		System.out.println("you total is: " + df.format (0.28*number));
		}
	    
	    else if (number<749){
	    System.out.println("Price per copy is 0.27");	
	    System.out.println("you total is: " + df.format(0.27*number));
	    }
		
	    else if (number<1000){
	    System.out.println("Price per copy is 0.26");
	    System.out.println("you total is: "+ df.format(0.26*number));
	    }
		
	    else if (number>1000){
	    System.out.println("Price per copy is 0.25");
	    System.out.println("you total is: " + df.format(0.25*number));
	    }
	    
		
	    	
	    }
	
	}
}
		  
		
		  
		
		
		
		
		
		



