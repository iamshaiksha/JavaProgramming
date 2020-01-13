package com.Bridgelabz.FunctionalCoreProgramming;
/** Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
 * w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16 
 * @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		if(t<=50&&v<=120){
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println(t);
		System.out.println(v);
		System.out.println(w);
		}
		else
		{
			System.out.println("Not valid");
		}

	}

}
