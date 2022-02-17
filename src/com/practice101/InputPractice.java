package com.practice101;

import java.util.Scanner;

public class InputPractice {

	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
		  System.out.println("Enter name of the instructor");
		  String name=scan.nextLine();
		  String action="";
		  
		  switch (name) {
		    case "Asghar":
		      action="Will take care of Java Assignment";
		      break;
		    case "Moazzam":
		      action="Will take care of SDLC Assignment";
		       break;
		    case "Weqas":
		      action="Will take care of Selenium Assignment";
		      break;
		    case "Asel":
		      action="Will take care of every Assignment";
		      break;
		    default:
		      action="Invalid instructor selected";
		  }

		
	}

}
