package com.syntax.class07;

import java.util.Scanner;

public class LoopNameLastNameAgeHW {

	public static void main(String[] args) {


		//Ask a user to enter name, last name and age 5 times. 
		//Every time your program should print those values in a format “You name is _ _ and you are _ years old’
		for (int i=0; i<=5; i++) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		
		System.out.println("Enter your last name");
		String lastName=scan.next();
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		
		
		
		
		System.out.println("Your name is "+name+" "+lastName+" and you are "+age+" years old.");
		
		}
		
	}

}
