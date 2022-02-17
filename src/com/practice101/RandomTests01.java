package com.practice101;

import java.util.Scanner;

public class RandomTests01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value");
		String sale=input.next();
		 if (sale.equalsIgnoreCase("no")) {
		 System.out.println(" You not shoping");
		
	} else if (sale.equalsIgnoreCase("Yes")) {
		
	System.out.println("What is the prive of the item");
	}
	
	int actualPrice=input.nextInt();
	
	int discount=0;
	if (actualPrice <= 20) {
		System.out.print(discount+" 10");
	}else if (actualPrice >= 20 && actualPrice <= 100) {
		System.out.println(discount+" 20");
	} else if (actualPrice >= 100 && actualPrice <=500) {
		System.out.println(discount+" 30");
	}else {
		System.out.println(discount+" 50");
		
		int savings=(actualPrice * discount)/100;
		int finalPrice=actualPrice - savings;
		System.out.println("After "+discount+" % disount the of the item reduced from "+" to " + finalPrice);
		
		
		
		
		}
	}
}
