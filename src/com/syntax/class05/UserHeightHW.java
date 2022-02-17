package com.syntax.class05;

import java.util.Scanner;

public class UserHeightHW {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");

		int inch = scan.nextInt();
		
		if (inch<60) {
			System.out.println("You are short.");
		}else if (inch>=60 && inch<=72) {
			System.out.println("You are medium height.");
		}else if (inch>72) {
			System.out.println("You are tall.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
