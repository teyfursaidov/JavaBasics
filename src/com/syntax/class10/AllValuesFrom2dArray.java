package com.syntax.class10;

public class AllValuesFrom2dArray {

	public static void main(String[] args) {


		int [][] numbers= {
				// index 0	 1	 2	 3	
						{10, 20, 30, 40, 50},	//index 0
						{100, 200, 300, 400, 500},	//index 1
						{1000, 2000, 3000, 4000, 5000} 	//index 2
		
		};
		// number.length -->> gives # of rows
			int size=numbers.length;	// when used with 2D array gives # of 1D arrays that we store
		
		System.out.println(size); // 3 arrays
		
		
		int sizeOf1Array=numbers[0].length; 
		System.out.println("Size of 1st Array "+sizeOf1Array);
		
		int sizeOf2Array=numbers[1].length; 
		System.out.println("Size of 2nd Array "+sizeOf2Array);
		
		
		int sizeOf3Array=numbers[2].length; 
		System.out.println("Size of 3rd Array "+sizeOf3Array);
		
		System.out.println("-----------------------------------------------------");
		
		//Retrieving all elements from 2D arrays 
			for (int i=0; i<numbers.length; i++) {
				
				for (int j=0; j<numbers[i].length; j++) {
					System.out.println(numbers[i][j]);
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
