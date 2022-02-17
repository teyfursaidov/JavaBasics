package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {


		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("Homany doses you have?");
			
			if(dose==1) {
				
				System.out.println("You need another shot.");
			
			}else {
					
				System.out.println("You are fully vaccinated");
				
			}
			
	
		}else {
			
			System.out.println("I do not have any further questions.");
		
		}
		
		System.out.println("------------------------------------------");
		
		
		/* declare a variable for allergy 
		 * if you have allergy --> 	
		 * 						if you have pollen allergy
		 * 						if you have peanut allergy
		 *						if you have wheat
		 *						
		 *	if no allergy --> lucky dog you are
		 *						
		 */					
		 
		
		
		
		boolean allergy=true;
			
				if (allergy) {
					
					System.out.println("Lets check what allergies you have.");
					
					String allergyType="gluten";
					
					// nested if always has a dependency on outer if.
					// outer if MUST be true in order for nested if to be checked
					
					if(allergyType.equals("pollen")) {
						
						System.out.println("Please stay at home when trees are blooming. Take medication.");
					
					}else if (allergyType.equals("peanut")) {
						
						System.out.println("Please don not eat food that contains nuts. Take medication.");
						
					}else if (allergyType.equals("gluten")) {
						
						System.out.println("Please follow gluten free diet. Take medication.");
						
					}else {
						
						System.out.println("I do not know what to suggest.");
					}
					
				}else {
					
					System.out.println("You are lucky.");
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
