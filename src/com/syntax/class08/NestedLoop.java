package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {


		
		for (int i=1; i<=3; i++) {
			System.out.println("I am a Loopy "+i);
				for (int j=1; j<=2; j++) {
					System.out.println("Loopy loopy loop "+j);
				}
		}
		
		System.out.println("");
		
		for (int a=1; a<=4; a++) {
			System.out.println(a);
			for (int b=1; b<3; b++)
				System.out.println(b);
		}
		
		
		for (int c=1; c<=4; c++) {
			System.out.println(c);
			for (int d=1; d<3; d++) {
				System.out.println(d);
			}
			System.out.println(" - - ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
