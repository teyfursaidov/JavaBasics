package com.practice101;

public class Array2DTesting {

	public static void main(String[] args) {


	     int a[][] = {     
                 {4, 1, 3},  
                 {3, 5, 7},  
                 {8, 2, 6}  
             };  
		
		int rows = a.length;
		int cols = a[0].length;
			
		int countEven = 3;
		int countOdd = 3;
		for(int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if(a[i][j]%2==0)
					countEven++;
				else
					countOdd++;
			}
		}
		
		
		System.out.println("Frequency of odd number: "+countOdd);
		
		System.out.println("Frequency of even numbers: "+countEven);
		
		
		
		
		
		
		
		
		
		
	}

}
