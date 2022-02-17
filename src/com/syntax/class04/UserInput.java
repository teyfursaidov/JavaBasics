package com.syntax.class04;

import java.util.Scanner;   // we need to import Scanner into our class

public class UserInput {

	public static void main(String[] args) {
		
		int num=10;
		num=20;

		Scanner input=new Scanner(System.in); // creating a Scanner by importing
		
		System.out.println("Please enter your name");
		
		
		String name=input.next();  //type String and hit enter
		
	
		System.out.println("Your name is "+name);
	
		// if you want to capture int --> use nextInt();
		
		System.out.println(name+" please enter your age");
		
		int age=input.nextInt();     // type integer and hit enter
		
		System.out.println("Your name is "+name+" and your age is "+age);
	}

}
