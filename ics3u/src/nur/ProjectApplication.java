/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Halima Nur
 * September 29th 2016
 * ProjectApplication.java
 * This program gets the amount and time you do for each task.
 *
 */
public class ProjectApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		
		double Designing;
		double Coding;
		double Debugging;
		double Testing;
		double total;
		
		
		
		System.out.println("Enter the amount spent on Designing:");
		Designing= Scan.nextDouble();
		System.out.println("Enter the amount spent on Coding:");
		Coding= Scan.nextDouble();
		System.out.println("Enter the amount spent on Debugging:");
		Debugging= Scan.nextDouble();
		System.out.println("Enter the amount spent on Testing:");
		Testing= Scan.nextDouble();
		System.out.format("\n");
		

		System.out.format("%3s%9s","Task","Time\n");
		System.out.format("%15s","Designing: " + df.format ( Designing/(Designing+Coding+Debugging+Testing)*100));
		System.out.format("\n");
		System.out.format("Coding: " + df.format ( Coding/(Designing+Coding+Debugging+Testing)*100));
		System.out.format("\n");
		System.out.format("Debugging: " + df.format ( Debugging/(Designing+Coding+Debugging+Testing)*100));
		System.out.format("\n");
		System.out.format("Testing: " + df.format ( Testing/(Designing+Coding+Debugging+Testing)*100));

	     
	    
		
		
		
		
	}

}
