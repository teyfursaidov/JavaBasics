package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		
		/* we need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry --> i am going to eat
		 *otherwise --> i am going to drink tea
		 */

		
		boolean hungry=true;
		
		if(hungry==true) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am going to drink tea");
		}
		
		
		
boolean hungry1=false;
		
		if(hungry1==true) {
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am going to drink tea");
		}
		
		
		boolean traffic=false;
		
		if(traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("I will be home early");
		}
		
boolean traffic1=true;
		
		if(traffic1) {
			System.out.println("I am coming home late");
		}
		
		
		
boolean traffic2=false;
		
		if(!traffic2) {
			System.out.println("I am coming home late");
		}
		
		
		/* define a variable to store a browser
		 * 
		 * if browser is chrome --> we are execuring tests on chrome
		 * otherwise --> i am not executing any test cases
		 */
		String browser="chrome"; // double quotes for string
		 	//with string use - equals
		
			// double == would work but not preferred 
		if (browser.equals("chrome")) {
			
			System.out.println("We are executing tests on Chrome"+".");
		}else {
			System.out.println("We are not executing any test cases on Chrome"+".");
		}
		
		
		/* if (browser) { } //type mismatch: cannot convert from String to boolean
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
