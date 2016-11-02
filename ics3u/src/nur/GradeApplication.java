/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * halima nur
 * Nov 2nd 2016
 *this program prints out your grade 
 */
public class GradeApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int mark;
		char grade;

		System.out.println("Enter your mark");
		mark= scan.nextInt();
		
		
		if (mark>= 90){
			grade= 'A';	
		}
		
		else if (mark>=80){
			grade= 'B';
		}
		
		else if (mark>=70){
			grade= 'C';
		}
		
		else if (mark>= 60){
			grade = 'D';	
		}
		
		else {
			grade='F';
		}		
		
		
		System.out.println("Your corresponding letter grade is = " + grade);


	}
}

