/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 *Halima Nur
 *December 1st 2016
 *GroupAssignment.java
 *This program prints out your first and last name and assigns you to a group.
 *
 */
public class GroupAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String firstname;
		String lastname;
		
		System.out.println("Enter your first name:");
		firstname= scan.nextLine();
		
		System.out.println("Enter your last name:");
		lastname= scan.nextLine();
		
		if(lastname.startsWith("A")|| lastname.startsWith("B")||lastname.startsWith("C")|
				lastname.startsWith("D")||lastname.startsWith("E")||lastname.startsWith("F")||
				lastname.startsWith("G")||lastname.startsWith("H")||lastname.startsWith("I"))
				{
			System.out.println(firstname + " " + lastname + " " + "assigned to Group 1");	
				}
		else if(lastname.startsWith("J")||lastname.startsWith("K")||lastname.startsWith("L")||
				lastname.startsWith("M")||lastname.startsWith("N")||lastname.startsWith("O")||
				lastname.startsWith("P")||lastname.startsWith("Q")||lastname.startsWith("R")||
				lastname.startsWith("S"))
				{
			System.out.println(firstname + " " +lastname + " " + "assigned to Group 2");	
	}
	
		else {
			System.out.println(firstname + " " + lastname + " " + "assigned to Group 3");	
		}
		
	
		
		
		

		{
	}
	}
}