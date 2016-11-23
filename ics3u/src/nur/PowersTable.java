/**
 * 
 */
package nur;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Halima Nur
 * Powertable.java
 * November 21 2016
 *This program does multiplication
 */
public class PowersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0");
		int x = 1;
		System.out.println("x^1\tx^2\tx^3\tx^4\tx^5");
		for (int i= 1; i<7; i++)
			System.out.println(df.format(Math.pow(i,1)) +"\t" +df.format(Math.pow(i,2)) +"\t"+df.format(Math.pow(i,3)) +"\t" +df.format(Math.pow(i,4)) +"\t"+ df.format(Math.pow(i,5)) +"\t");
		
		
	}
	

}
