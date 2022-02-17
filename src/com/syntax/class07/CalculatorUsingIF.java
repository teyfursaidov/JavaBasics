package com.syntax.class07;

import java.util.Scanner;

public class CalculatorUsingIF {

	public static void main(String[] args) {


		Scanner calc = new Scanner (System.in);
		System.out.println("Please eneter your first value.");
		double val1= calc.nextDouble();
		System.out.println("Please enter desired operation:+,-,*,/");
		char op=calc.next().charAt(0);
		System.out.println("Please enter your secont value.");
		double val2=calc.nextDouble();
		
		double result=0.0;
		
		if (op=='+') {
			result=val1+val2;
		}else if (op=='-') {
			result=val1-val2;
		}else if (op=='*') {
			result=val1*val2;
		}else if (op=='/') {
			result=val1/val2;
		}else {
			System.out.println("Invalid entry.");
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
