package com.syntax.class10;

public class InClassTask03 {

	public static void main(String[] args) {


		
		String [][] name=new String[2][4];
		
		name[0][0]="Smith";
		name[0][1]="Jordan";
		name[0][2]="Jackson";
		name[0][3]="Obama";
		
		name[1][0]="Mr";
		name[1][1]="Mrs";
		name[1][2]="Ms";
		name[1][3]="Miss";
		
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

	
		System.out.println(name[1][0]+" "+name[0][3]);
		System.out.println(name[1][1]+" "+name[0][0]);
		System.out.println(name[1][2]+" "+name[0][2]);
		System.out.println(name[1][3]+" "+name[0][1]);
		
		
		
		String [][] students= {
				{"Smith", "Jordan", "Jackson", "Obama"},
				{"A", "B"}
		}; 
			System.out.println(students[0][0]+" grade is "+students[1][1]);
			System.out.println(students[0][1]+" grade is "+students[1][0]);
			System.out.println(students[0][2]+" grade is "+students[1][0]);
			System.out.println(students[0][3]+" grade is "+students[1][1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
