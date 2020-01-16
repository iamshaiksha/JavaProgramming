package com.Bridgelabz.junit.program;

import com.Bridgelabz.utility.Utility;

public class TemparatureConversion {

	public static void main(String[] args) {
			System.out.println("Enter temparature in farenheit");
			double f=Utility.getDouble();
			celsius(f);
		
		
		
		
	}

	public static double celsius(double f) {
			
		
		double c=(f-32)*5/9;
		System.out.println("temparature in celsius is"+" "+c);
		return c;
		
	}

}
