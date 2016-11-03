/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * halima nur	
 * nov 2nd 2016
 *
 */
public class DozenEggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		double egg;
		
		System.out.println("Enter number of eggs."); egg = scan.nextDouble();
		egg= egg/12;
		
		{
		if (egg>=11){
		System.out.println("Price per dozen eggs is $0.35");
		System.out.println("you total is: "  + (df.format (0.35*egg)));
	    }
	
	    else if (egg>=6){
		System.out.println("Price per dozen is $0.40");	
		System.out.println("you total is: " + (df.format (0.40*egg)));
		}
	    
	    else if (egg>=4){
	    System.out.println("Price per dozen is 0.45");	
	    System.out.println("you total is: " + (df.format(0.45*egg)));
	    }
		
	    else{
	    	System.out.println("Price per dozen eggs is: $0.50");
	    	System.out.println("your total is : " +(df.format(egg*0.50)));		

	    }
	    
	    }
		
	    
	   

}
}