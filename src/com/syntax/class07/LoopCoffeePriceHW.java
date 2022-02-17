package com.syntax.class07;

import java.util.Scanner;

public class LoopCoffeePriceHW {

	public static void main(String[] args) {

		//Declare a variable to store a price for a coffee. Ask user to pay for a coffee. 
		//Keep asking to pay for coffee until user enters exact amount . 
		//If user give more than $3 --> ask them to give less, if user gives less money then ask to give more. 
		//Once user got a write amount print “Please enjoy your candy”

		
		
		
		
		/*int price=0;
		
		Scanner scan=new Scanner (System.in);
		int pay;
		do {
		System.out.println("Please pay for your coffee.");
		pay=scan.nextInt();
		
		}while (pay!=price);	
		
		
		
		
		
		
		
		int price1=3;
			for (int price11=3; price11<=3; price11++) {
				System.out.println("Pay more.");
				price11=scan.nextInt();
			}
			for (int price11=3; price11>=3; price11--) {
				System.out.println("Pay less.");
				price11=scan.nextInt();
			}
		
			System.out.println("Enjoy your coffee.");
		*/
		
		
		
		Scanner input = new Scanner(System.in);
		String item;
		double price;
		double money;
		double reminder;
		double sum=0;
		
		System.out.println(" Please tell me what do you want to drink");
		item=input.next();
		
		System.out.println(" Please enter the price");
		price=input.nextDouble();
		
		do {
			System.out.println(" Please pay for the "+item);
			money=input.nextDouble();
		
			sum+=money;
			
			if (sum>price) {
				
				double change=sum-price;
				System.out.println("Here is your change "+change);
				break;
				
			}else if (sum<price) {
				
				reminder=price-sum;
				System.out.println("Please give me more "+reminder);
				
			}else {
				System.out.println("You got the right amount.");
			}
		
		}while (sum!=price);
		
		System.out.println("Thank you for shopping.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
