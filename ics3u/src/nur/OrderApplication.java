/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Halima Nur
 * September 30th 1016
 * OrderApplication.java
 * This program give you the price of the food you purchase.
 *
 */
public class OrderApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		
		double burgerprice =1.69;
		double friesPrice = 1.09;
		double sodasprice = 0.99;
		double amountTendered;
		double change;
		
		int numburger;
		int numfries;
		int numsodas;
		
		System.out.println("Enter number of burgers.");
		numburger= Scan.nextInt();
		System.out.println("Enter number of Fries.");
		numfries= Scan.nextInt();
		System.out.println("Enter number of Sodas.");
		numsodas= Scan.nextInt();
		
		
		System.out.println("Total before tax $:" + df.format (1.69*numburger +1.09*numfries + 0.99*numsodas));
		double total = (1.69*numburger +1.09*numfries + 0.99*numsodas);
		System.out.println("Tax; $" + df.format (total*0.065));
		double Tax = (1.69*numburger +1.09*numfries + 0.99*numsodas) * (0.065);
		System.out.println("Final total: " + df.format (total +Tax));
		double Finaltotal = (total +Tax);
		
		System.out.println("Enter tendered:");
		amountTendered = Scan.nextInt();
		
		System.out.println("Change : $" + df.format (amountTendered - Finaltotal));
		
				
		
	
		
		
		
		
			
	}

}
