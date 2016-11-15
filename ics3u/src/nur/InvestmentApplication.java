/**
 * 
 */
package nur;

/**
 * Halima Nur
 * November 14th 2016
 *InvestmentApplication.java
 *This program print out the years it while take to invest it.
 *
 */
public class InvestmentApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int investment = 2500;
		int FInvestment =5000;
		double currentInvestment = investment;
		int year = 1;
		
	while (currentInvestment <= FInvestment){	
		
	
		year = year + 1 ;
	
	currentInvestment = currentInvestment*1.075;
	
	}	
		System.out.println("It will take "+year+" years.");
	
		
		
		
	
	}

}
