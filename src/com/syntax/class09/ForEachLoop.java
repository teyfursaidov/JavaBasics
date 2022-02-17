package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {


		//if you have an array you can use for each loop to iterate/lop through the entire array
		
		String[]  cities= {"Washingron DC", "Boston", "Miami", "Los Angeles", "New York", "Rostov-on-Don"};
		
		
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println("=============================================================");
		
		int[] numbers= {10,20,30,40};
			
		for(int num:numbers)
			System.out.println(num);
		
		System.out.println("=============================================================");
		
		char[] grade= {'A', 'B', 'C', 'D'};
		for (char grades:grade) {
			System.out.println(grades+" ");
		}
		
		
		String[] country=new String[5];
		country[0]="USA";
		country[1]="Canada";
		country[2]="Afghanistan";
		country[3]="Moldova";
		country[4]="Morocco";
		
		for (String countries:country) {
			System.out.println(countries);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
