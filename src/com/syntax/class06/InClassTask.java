package com.syntax.class06;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {


		/* Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter country");
		String country=scan.nextLine();
		String language="";
		
		switch (country) {
		
		case "Russia":
			language="Russian";
			break;
		case "USA":
			language="English";
			break;
		case "Mexico":
			language="Spanish";
			break;
		default:
			language="Unknown";
		}
		
		System.out.println("If you are from "+country+" you speak "+language);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
