package com.syntax.class08;

import java.util.Scanner;

public class InClassLoopTask {

	public static void main(String[] args) {

		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 */
		
		for (int i=1; i<50; i++) {
			if (i%3==0)
				continue;
			System.out.print(i +" ");			
		}
		
		
		System.out.println("");
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want a credit card?");
			String answer = scan.nextLine();

			do {
				if (answer.equalsIgnoreCase("yes")) {
					break;

				} else {
					System.out.println(" Do yo want the card? ");
					answer = scan.nextLine();
				}

			} while (answer != "yes");

			System.out.println("Please enjoy your card");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
