package com.syntax.class04;

import java.util.Scanner;

/* to import in mac: cmd+shift+o
 * to import in windows: ctrl+shift+o
 */

public class TakeInput {

	public static void main(String[] args) {

		// create a Scanner and assign to a variable
		
		Scanner scan=new Scanner(System.in);
		
		
		
		// specify instructions
		
		System.out.println("Please enter country wehre you are from.");
		
		
		// we need to capture String value --> use next();
		
		String country=scan.next();
		
		System.out.println("You are from "+country+".");
		
		
		
		//if you are from USA --> you speak English
		// if you are from France --> you speak French
		
		if(country.equals("France")) {
			
			System.out.println("You speak French"+".");
		
		}else if(country.equalsIgnoreCase("USA")) {
			
			System.out.println("You speak English"+".");
		
		}else if(country.equals("Turkey")) {
			
			System.out.println("You speak Turkish"+".");
			
		}else {
			
			System.out.println("I do not know which language you speak"+".");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
