package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {


		int[] num= {100, 45, 100, 32};
		
		int largest=num[0];
		
		for (int n=1; n<num.length; n++) {
			
			if (num[n] > largest); {
				
				largest=num[n];
			}
		}
		
		
		System.out.println(largest);
		
		largest=num[0];
		
		for (int number:num) {
			if (number>largest) {
				largest=number;
			}
		}
		
		System.out.println(largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
