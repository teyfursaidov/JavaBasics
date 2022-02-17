package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {


		for (int i=1; i<=3; i++) {
			
			if (i==3) {
				continue; //skip current iteration/cycle
					}
			System.out.println("Hello");
			System.out.println("We are doomed.");
		}
		
		
		
		// i want to print all number from 1 to 10 except number 4
		
		
		for (int i=1; i<=10; i++) {
			if(i==4 || i==7) {
				continue;
			}
			System.out.println(i+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
