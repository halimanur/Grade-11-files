/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * January 13th 2017
 * FunWithMath.java
 * This program  gets two numbers from the user and then adds, subtracts, multiplies and divides them.
 *
 */
public class FunWithMath {

	/**
	 * @param args
	 */

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick two numbers:");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		System.out.print("Press 1 to Subtract, press 2 to add, press 3 to multiply, press 4 to divide:");
		int numbs=scan.nextInt();
		int total = 0;
		
		
		
		if (numbs==1){
		System.out.println(num1-num2);
		}
		
		else if (numbs==2){
		System.out.print(num1+num2);
		
		}
		else if (numbs==3){
			System.out.println(num1*num2);
			
		}
		else if (numbs==4){
			System.out.println(num1/num2);
			
		}
	}
	
	/**
	 * Subtracts the two numbers.
	 */
		public static void subtract(int num1, int num2){
		int total= num1-num2;
		System.out.println("Your total is " + total);
	}

		/**
		 * adds the two numbers.
		 */
			public static void add(int num1, int num2){
			int total= num1+num2;
			System.out.println("Your total is " + total);

}
			/**
			 * Multiply the two numbers.
			 */
				public static void Multiply(int num1, int num2){
				int total= num1*num2;
				System.out.println("Your total is " + total);

}
				/**
				 * Divides the two numbers.
				 */
					public static void Divide(int num1, int num2){
					int total= num1/num2;
					System.out.println("Your total is " + total);

}
}