package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {


		
		
		
		/* 3 x 1 =3
		 * 3 x 2 =6
		 * 3 x 3 =9
		 * 3 x 10 =30
		 */
		
		int num=3;
		int result;
		 for (int i=1; i<=10;i++) {
			 result=num*i;
			 
			 System.out.println(num+" X "+i+" = "+result);
		 }
		
		System.out.println("==================================================");
		
		int value=1;
		for (int i=1; i<4; i++) {
			value*=i;
		}
		
		
		System.out.println(value);
		
		
		System.out.println("------------------------------------");
		
		
		// i want to find ou the sum of all even and all odd numbers from the range 1 to 50
		
		
		int num3=1;
		while (num3<=50) {
			if (num3%2==0) {
				System.out.print(num3+" ");
			}
			num3++;
		}

				System.out.println("");
		int num4=1;
		while (num4<=49) {
			System.out.print(num4+" ");
			num4+=2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
