package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {


		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		//how many elements inside array?
			int size=grade.length;
				System.out.println("Numbers of elementws is = "+size);
		
		//System.out.println(grade[1]);
		//System.out.println(grade[2]);
		//System.out.println(grade[3]);
		//System.out.println(grade[4]);
		//System.out.println(grade[5]);
		
		
		
		for (int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
			System.out.println("");
		
		String[]  cities= {"Washingron DC,", "Boston, ", "Miami,", "Los Angeles,", "New York,", "Rostov-on-Don."};
			for (int a=0; a<cities.length; a++)	{
				System.out.println(cities[a]+" ");
				
				if(cities[a].equals("Miami,")) {
					System.out.println("I want to live in Miami.");
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
