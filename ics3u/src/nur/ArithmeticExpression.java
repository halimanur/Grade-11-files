/**
 * 
 */
package nur;
import java.util.Scanner;

/**
 * @author Halima Nur
 * September 26th 2016
 * Java.util.scanner;
 * 
 */
public class ArithmeticExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		System.out.println("Enter 5 numbers.");
		num1= scan.nextInt();
		
		int num2;
		num2= scan.nextInt();
		
		int num3;
		num3= scan.nextInt();
		
		int num4;
		num4= scan.nextInt();
		
		int num5;
		num5= scan.nextInt();
		System.out.println("The sum of all five numbers is: " + (num1+num2+num3+num4+num5));
		System.out.println("The result after subtracting the second number from the third is: " + (num2-num3));
		System.out.println("The product of the first and fifth number is: " + (num1*num5));
		System.out.println("The quotient of the fourth number divided by the second is: " + (num4/num2));
		System.out.println("The remainder when dividing the fourth number by the second is: " + (num4%num2));
		System.out.println("The first number raised to the power of the third number is: " + Math.pow (num1,num3));
		System.out.println("The square root of the fifth number is: " + Math.sqrt(num5));
		
		


		
		
		
				
				
		
			
		
		
		
		
		
	

	


	}

}
