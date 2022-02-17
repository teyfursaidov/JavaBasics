package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberExampleLoop {

	public static void main(String[] args) {


		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		System.out.println("Please enter a number to win.");
		guessNumber=scan.nextInt();
		while(guessNumber!=secretNumber) {
			System.out.println("Please try again.");
			guessNumber=scan.nextInt();
			
		}
		System.out.println("Congratulations you won.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
