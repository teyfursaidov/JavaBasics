package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {


		// create a secret number
		
		// we want user to guess our secre number
		
		// the moment user guessed my secre number -->> my program should stop
		//otherwise it should continue asking to guess number
		
		int secretNumber=12;
		
		Scanner scan=new Scanner (System.in);
		int guessNumber;
		do {
		System.out.println("Enter your number to win.");
		guessNumber=scan.nextInt();
		
		}while (guessNumber!=secretNumber);	
		
		
		System.out.println("Congrats to you my fellow Javaist.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
