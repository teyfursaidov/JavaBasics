package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {

		
		// main method shortcut main+ctr+space
		// ctr+space -- autocomplete
		
		int i=10;
		
		double d=10; //widening or implicit. 
					//we store int value 10 inside double variable
		
		System.out.println(i);
		System.out.println(d);
		
		int num=(int)10.99; //narrowing or explicit casting
							// we store double value 10.99 into in variable
		System.out.println(num);
		
		float f=10.99f; // type mismatch: cannot convert from double to float
		
		
		byte b=(byte)128; // type mismatch: cannot convert from int to byte
		
		
		
		System.out.println(b);
		
			//narrowing
		long number=11568768768l;
		 int number1=(int)11568768768l;
		
		System.out.println(number1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
