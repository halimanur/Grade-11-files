/**
 * 
 */
package nur;

import java.util.Scanner;

/**
*Halima Nur 
*Nov 24th 2016 
*Chaos.java 
*This program ask for a number and puts in a equation
 */
public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double ans;
		System.out.println("Enter a number");
		ans = scan.nextDouble();

		for (int i = 0; i < 50; i++) {
			ans = 2 * ans * (1 - ans);
			System.out.println(ans);

		}
	}

}
