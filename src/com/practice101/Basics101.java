package com.practice101;

import java.util.Scanner;

public class Basics101 {

	public static void main(String[] args) {

		
		/*int myNumber=825;
	      int stepOne=myNumber*myNumber;
	        int stepTwo=myNumber*myNumber+myNumber;
	          int stepThree=stepTwo/myNumber;
	            int stepFour=stepThree+17;
	              int stepFive=stepFour-myNumber;
	                int stepSix=stepFive/6;
	                
	                
		
	                System.out.println("The magic number is "+stepSix+"!");
		
		
		char c = 'Z';
		
		
		System.out.println(c);
		*/
		
		
		   int d;
           Scanner s =new Scanner(System.in);
           System.out.println("Enter the the number");
           d=s.nextInt();
           int  a[] = new int[d];
           System.out.println("Enter all the numbers");
           for (int i=0; i<d;i++){
           	
           	a [i] =s.nextInt();{
           		System.out.println("Odd numbers");
           		for(int i1=0; i1<d;i1++) {
           			if (a[i1] % 2 !=0) {
           				System.out.println(a[i1]+" ");
           				
           			}
           		}
           		System.out.println("---------");
           		System.out.println("Even Numbers");
           		for(int i1=0;i<d;i1++) {
           			if(a[i1] % 2 ==0 );
           			
           			
           		}
           		
           		
           		
           		
           	}
           	
           	
           	
           	
           	
           	
           	
           }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
