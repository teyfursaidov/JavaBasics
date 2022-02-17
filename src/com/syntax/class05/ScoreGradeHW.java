package com.syntax.class05;

import java.util.Scanner;

public class ScoreGradeHW {

	public static void main(String[] args) {


		
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter your quiz score");		
		int score = scan.nextInt();					
		if(score>90) {
			System.out.println("Your quiz grade is A.");		
		}else if (score>70 && score<90) {
				System.out.println("Your quiz grade is B.");				
		}else if (score>50 && score<70)	{
			System.out.println("Your quiz grade is C.");		
		}else if (score<50) {
			System.out.println("Your quiz grade is F.");
		}		
		System.out.println("Enter your mid term score");		
			int score1 = scan.nextInt();		
		if(score1>90) {
			System.out.println("Your grade is A.");		
		}else if (score1>70 && score<90) {
				System.out.println("Your grade is B.");				
		}else if (score1>50 && score<70)	{
			System.out.println("Your grade is C.");		
		}else if (score1<50) {
			System.out.println("Your grade is F.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
