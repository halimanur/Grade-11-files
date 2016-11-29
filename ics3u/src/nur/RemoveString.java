/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * November 29th 2016
 * RemoveString.java
 * This program removes the word you enter
 */
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sentence;
		String word;

		System.out.println("Enter a sentence:");
		sentence=scan.nextLine();

		System.out.println("Enter a String:");
		word=scan.nextLine();

		System.out.println(sentence.replace(word,""));
		scan.close();
	}
}


