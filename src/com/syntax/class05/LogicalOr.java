package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {


			String day = "Wednesday";
			
			if (day.equals("Saturday") || day.equals("Sunday")  || day.equals("Wednesday"))  {
					
					System.out.println("I have a Java class.");
			}
		
		
		System.out.println("Code outside of IF statement.");
		
		
		/*  lets ask user what is todays day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if (Monday or Friday) -->> there is no class
		 * 
		 * else if (Tuesday or Wednesday) -->> manual testing
		 * 
		 * else if (Thursday) -->> review class 
		 * 
		 * else if (Saturday or Sunday) -->> Java class
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What day is it?");
		
		day=scan.nextLine();
			
			if (day.equals("Monday") || day.equals("Friday")) {
					
					System.out.println("There is no class.");
					
			}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
				
				System.out.println("We have Manual Testing.");
				
			}else if (day.equals("Thursday")) {
					
				System.out.println("Review class.");
				
			}else if (day.equals("Saturday") || day.equals("Sunday")) {
				
				System.out.println("Java class.");
			
			}else {
				
					System.out.println("Wrong input.");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
