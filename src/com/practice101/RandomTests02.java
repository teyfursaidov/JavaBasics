package com.practice101;

public class RandomTests02 {

	public static void main(String[] args) {


		
		 for (int i = 1; i <= 5; i++) {
	           for (int j = 1; j <=10 ; j++) {
	                System.out.print(i*j+" ");
	           }
	            System.out.println();
	        }
		
		
		int n=3;
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				if (i==0 || j==0 || i==n || j==n) {
					System.out.print("X ");
				}else {
					System.out.print("  ");
				}
			
			}
		
		System.out.println();
		
		}
		
		
		for (int i=0; i<=7; i++) {
		     for (int j=1; j<=7-i; j++) {
		       System.out.print(j+" ");
		     }
		     System.out.println();
		   }
		   for (int i=2; i<=7; i++) {
		     for (int j=1; j<=i; j++) {
		       System.out.print(j+" ");
		     }
		     System.out.println();
		   }
		
		
		
		
		 int [] values = {45, 78, 12, 67, 55};
	      for (int i=0; i<values.length; i++) {
	        System.out.print(values[i]+" ");
	      }
		
		
		
		
		
		 int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
	        for (int i = 0; i < numbers.length; i++) {
	            if (i % 2 == 0) {
	                System.out.print(numbers[i] + " ");
	            }
	        }
		
		
		
		
		String name="syntax";
			char array[] = new char[6];
			
			name.getChars(0, 6, array, 0);
			
			for (char i=0; i<array.length; i++) {
				if(i%2==0);
			}
		
			System.out.print(array[0]);
		
		
		System.out.println("");
		
		String[]  cars= {"Volvo", "BMW", "Ford"};
			for (String i:cars) {
				System.out.print(i+" ");
			}
		
		System.out.println("");
			 int x = 10;
		        int y = 5;
		        x = x + y;
		        y = x - y;
		        x = x - y;
		        System.out.println("After swapping:"
		                           + " x = " + x + ", y = " + y);
		
		
		
		
		
		
		
		
		
		
		
	}

}
