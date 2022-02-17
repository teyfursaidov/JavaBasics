package com.syntax.class10;

public class InClassTask02 {

	public static void main(String[] args) {


		
		
		
		//Create an array of countries. While retrieving all values from an array print capital for each country
		
			String [] country= {"Poland", "Germany", "Ukraine", "Russia", "UK"};
				String capital = null;
				
				for (int i=0; i<country.length; i++) {
					switch (country[i]) {
					case "Poland":
						capital = "Warsaw";
						break;
					case "Germany":
						capital = "Berlin";
						break;
					case "Ukraine":
						capital = "Kiev";
						break;
					case "Russia":
						capital = "Moscow";
						break;
					case "UK":
						capital = "London";
						break;
					}
				
					System.out.println("The capital of the country "+country[i]+" is "+capital);
				
				}
		
					System.out.println("-=-==-=-=-=-=-=-=-=-=-=Another way=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		
					for(String countries:country) {
						if (countries.equals("Poland")) {
							capital="Warsaw";
						}else if (countries.equals("Germany")) {
							capital="Berlin";
						}else if (countries.equals("Ukraine")) {
							capital="Kiev";
						}else if (countries.equals("Russia")) {
							capital="Moscow";
						}else if (countries.equals("UK")) {
							capital="London";
						}
						System.out.println("The capital of "+countries+" is "+capital);
					}
		
		
		
		
		
		
		
				
		
	}

}
