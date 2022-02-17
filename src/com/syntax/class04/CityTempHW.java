package com.syntax.class04;

import java.util.Scanner;

public class CityTempHW {

	public static void main(String[] args) {


		Scanner temp=new Scanner(System.in);
		
		System.out.println("Enter city");
		
		String city=temp.nextLine(); 
		
		System.out.println("What is the temperature?");
		
		int far=temp.nextInt();	// int farenheight, celsius; 
								// farenheight = input.nextInt();
		int cel=(far-32)*5/9;
		
		System.out.println("The temperature in "+city+" is "+cel+" Celsius.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
