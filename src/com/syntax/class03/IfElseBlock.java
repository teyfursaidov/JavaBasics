package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {


		int num1=100;
		int num2=50;
		
		// which number is largest
		
		if(num1>num2) {
			System.out.println(num1 +" is larger than "+num2);
		} else {
			System.out.println(num2+" is larger than "+num1);
		}
		// system will only run the correct statement and ignore incorrect
		
		
		int temp=72;
		// if temp is more than 72 --> i will sit home
		// otherwise i will go for a walk
		
		if (temp<=72) {
			System.out.println("I will sit home");
		}else {
			System.out.println("I will go for a walk.");
		}
		
		
		/* I need a variable that store a gender
		 * if gender is male --> front wagon
		 * otherwise --> rear wagon
		 *
		 */
		
		char gender='m';
		
		if (gender=='m') {
			System.out.println("Please use front wagon");
		
		}else {
			System.out.println("Please use rear wagon");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
