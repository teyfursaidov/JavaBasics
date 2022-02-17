package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {

		
		int num=1; 
		// creating an array that holds 4 elements
		int[] numbers=new int[4];
		// storing values/ elements inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		// print 99
		System.out.println(numbers[3]);
		
		System.out.println(numbers[0]+numbers[3]);
		// I want to create an array of countries
		
		String[] countries=new String[6];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova ";
		countries[4]="Morocco";
		countries[5]="Turkey";
		System.out.println(countries[3]+countries[4]);
		
		
		String[] names=new String[5];
		
		names[1]="Orsan";
		names[2]="Gulnar";
		names[3]="Zakirullah";
		System.out.println(names[1]);
		System.out.println("Values in index 0 is ="+names[4]);
		
		names[1]="Daniyar";
		System.out.println(names[1]+" is just a variable.");
		
		
		//Create an array to store different prices
		//4 different prices
		//find an average of how much we spent
		
		double[] price=new double[5];
		
		price[0]=13.75;
		price[1]=6.41;
		price[2]=11.02;
		price[3]=21.33;
		price[4]=17.10;
		double average=(price[0]+price[1]+price[2]+price[3]+price[4])/5;
		System.out.println("My spending average is "+average);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
