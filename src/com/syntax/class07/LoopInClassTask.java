package com.syntax.class07;

public class LoopInClassTask {

	public static void main(String[] args) {


		
		
		/*Print numbers from 1 to 100 in 1 line with space
			Print numbers from 100 to 1
			Print even numbers from 20 to 100 
			Print only odd numbers from 100 to 1
		 */
		
		
		int num1=1;
			while (num1<=100) {
				System.out.print(num1+" ");
				num1++;
			}
		
			System.out.println("");
		int num2=100;
			while (num2>=1) {
				System.out.print(num2+" ");
				num2--;
			}
		
		
			System.out.println("");
		int num3=20;
				while (num3<=100) {
					if (num3%2==0) {
						System.out.print(num3+" ");
					}
					num3++;
				}
		
			System.out.println("");
		int num4=99;
			while (num4>=1) {
				System.out.print(num4+" ");
				num4-=2;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
