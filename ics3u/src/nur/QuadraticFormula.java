/**
 * 
 */
package nur;
import java.util.Scanner;

/**
 * @author halima nur
 * September 30th, 2016
 *
 */
public class QuadraticFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		System.out.println("Enter 3 numbers.");
	    a= scan.nextInt();
	   
	    int b;
	    b=scan.nextInt();
	    
	    int c;
	    c=scan.nextInt();
	    
	   System.out.println(-b + Math.sqrt(Math.pow(b,2))+(-4*a*c)/(2*a));
	   System.out.println(-b - Math.sqrt(Math.pow(b,2) -4*a*c)/2*a);
	   
	   
	   
	   
	   
	    
		

		
	}

}
