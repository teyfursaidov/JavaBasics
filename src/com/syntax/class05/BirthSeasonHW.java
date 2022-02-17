package com.syntax.class05;

import java.util.Scanner;

public class BirthSeasonHW {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the month you were born in");
		
		String month = scan.next();
		
		
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			
				System.out.println("You were born in spring.");
		
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
				
				System.out.println("You were born in summer.");
		
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
				
				System.out.println("You were born in autumn.");
		
		}else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			
				System.out.println("You were born in winter.");
		
		}else {
			System.out.println("Invalid entry.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
