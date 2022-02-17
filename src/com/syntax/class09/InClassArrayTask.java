package com.syntax.class09;

public class InClassArrayTask {

	public static void main(String[] args) {


		// 1. Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		 
		
		
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
			System.out.println("Your grade is "+grade[1]+".");
		
		char[] grade1;
		grade1=new char[6];
			grade1[0]='A';
			grade1[1]='B';
			grade1[2]='C';
			grade1[3]='D';
			grade1[4]='E';
			grade1[5]='F';
		
			System.out.println("Your new grade is "+grade1[1]+".");
		
		
		System.out.println("==============Second Task======================");
		// 2. Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		
		
		String[] names= {"Spider-Man", "Captain America", "Hulk", "Iron-Man", "Thor", "Loki"};
			System.out.println("My group includes "+names[3]+" and "+names[5]+".");
		
			String[] groupNames;
			groupNames=new String[6];
			groupNames[0]="Superman";
			groupNames[1]="Batman";
			groupNames[2]="Wonder-Woman";
			groupNames[3]="Flash";
			groupNames[4]="Aquaman";
			groupNames[5]="Shazam";
				System.out.println("My new group includes "+groupNames[4]);
		
		System.out.println("==============Third Task==========================");
		// 3. Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[] blah;
		blah=new String[5];
		blah[0]="Java ";
		blah[1]="Saturday ";
		blah[2]="coding ";
		blah[3]="is ";
		blah[4]="day ";
			System.out.println(blah[1]+blah[3]+blah[0]+blah[2]+blah[4]+".");
		
		
		String[] word= {"Java ", "Saturday ", "day ", "coding ", "is "};
			System.out.println(word[1]+word[4]+word[0]+word[3]+word[2]+".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
