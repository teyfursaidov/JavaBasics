package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {


		
		//Create an array on integers and calculate the sum of all elements in an array
		
		int[] numbers= {15, 72, 110, 33, 24};
		
		int size=numbers.length;
		int sum=0;
		for (int i=0; i<size; i++) {
			sum+=numbers[i];
		}
		
		System.out.println("The sum of all elements in the array = "+sum);
		
		
		sum=0;
		for (int num: numbers) {
			sum+=num;
		}
		System.out.println("The sum of all elements in the array = "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
