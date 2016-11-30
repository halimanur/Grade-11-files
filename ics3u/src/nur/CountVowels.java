/**
 * 
 */
package nur;

import java.util.Scanner;

/**
 * Halima Nur
 * November 29th 2016
 * CountVowels.java
 * This program count the number of vowels
 */
public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text;
		int vowel =0;
		
		System.out.println("Enter text");
		text= scan.nextLine();

		for(int i=0;i<text.length();i++){
			
			
	        if(text.charAt(i)==('a')){
	        	vowel++;
	        }
	       
	        else if(text.charAt(i)==('e')){
	        	vowel++;
	        }
	        else if(text.charAt(i)==('i')){
	        	vowel++;
	        }
	        	else if(text.charAt(i)==('o')){
	        		vowel++;
	        }
	        	else if(text.charAt(i)==('u')){
	        		vowel++;
	        	}
	        
			
			

		
		}

		System.out.println("The number of vowels in " + text +" is " +  vowel );
	}
}