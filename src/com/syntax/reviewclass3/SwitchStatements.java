package com.syntax.reviewclass3;

public class SwitchStatements {

	public static void main(String[] args) {

//		int number=10;
//		if(10==number) {
//			
//		}
//		
//		if(number==10) {
//			
//		}
//		
		

		
		String day="Sunday";
		
		if("Monday".equals(day)) {
			System.out.println("It is Monday.");
		}else if("Tuesday".equals(day)) {
			System.out.println("It is Tuesday.");
		}else if("Wednesday".equals(day)) {
			System.out.println("It is Wednesday.");
		}else if("Thursday".equals(day)) {
			System.out.println("It is Thursday.");
		}else if("Friday".equals(day)) {
			System.out.println("It is Friday.");
		}else if("Saturday".equals(day)) {
			System.out.println("It is Saturday.");
		}else if("Sunday".equals(day)) {
			System.out.println("It is Sunday.");
		}
		
		
		//Where possible alway go for switch statements
		switch (day) {
		case "Monday":
			System.out.println("Its Monday.");
			break;
		case "Tuesday":
			System.out.println("Its Tuesday.");
			break;
		case "Wednesday":
			System.out.println("Its Wednesday.");
			break;
		case "Thursday":
			System.out.println("Its Thursday.");
			break;
		case "Friday":
			System.out.println("Its Friday.");
			break;
		case "Saturday":
			System.out.println("Its Saturday.");
			break;
		case "Sunday":
			System.out.println("Its Sunday.");
			break;
		}
		
		
		
		
		
		
		
	}


}