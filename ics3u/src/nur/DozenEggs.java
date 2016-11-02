/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 333524585
 *
 */
public class DozenEggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		
		int dozen;
		double price = 0.0; 
		int Eggs;
		

		System.out.println("Enter number of eggs being purchased.");
		dozen= scan.nextInt();
	
		if (dozen>4){
			price= 0.50;
	    }
		
		else if(dozen>6){
			price= 0.45;
		}
		
		else if(dozen>11){
			price= 0.40;
		}
		
		else if(dozen<11){
			price= 0.35;
		}
		
		System.out.println("Price is " + price);
		System.out.println("you total is: "  + df.format (price*dozen));
		System.out.println(");

}
}