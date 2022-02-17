package com.syntax.class04;

import java.util.Scanner;

public class CreditCardHW {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Do you have a credit card?");
		String credit = input.next();
		
		if (credit.equalsIgnoreCase("yes")) {
				System.out.println("What is the balance on your credit card?");
		}if (credit.equalsIgnoreCase("no")) {
			System.out.println("Would you like to get a credit card?");
			
			double balance = input.nextDouble();
			
			if (balance > 1000) {
				
				System.out.println("Pay off the immediately");
				
			}else {
				
				System.out.println("You can spend more!");
			}
				
			
		
		}
		

	
		
		
	
	}
}
