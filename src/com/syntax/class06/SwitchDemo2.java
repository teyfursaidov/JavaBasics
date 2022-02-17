package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {


		char choice='y';
		String answer;
		
		switch (choice) {
		
		case 'y': 
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="404 ERROR";
			break;
		}
			System.out.println(answer);
		
		System.out.println("====================================================");
		
		/* declare a variable to store a car
		 * based on the car define the country it was made in
		 */
		
		String car="LADA";
		String country = null;
		
		switch(car.toLowerCase()) {
		
		case "BMW":
			country="Germany";
			break;
		case "Ford":
			country="USA";
			break;
		case "Lada":
			country="Russia";
			break;
		case "Toyota":
			country="Japan";
			break;
		default:
			country="Unknown";
			break;	
		}
		 
		System.out.println(car+" is from "+country);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
