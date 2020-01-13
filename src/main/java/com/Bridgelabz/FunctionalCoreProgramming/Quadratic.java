package com.Bridgelabz.FunctionalCoreProgramming;
/** Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula (Note: Take a, b and c as input values)
  	delta = b*b - 4*a*c
	Root 1 of x = (-b + sqrt(delta))/(2*a)
	Root 2 of x = (-b - sqrt(delta))/(2*a)
 *  @Shaik Shaiksha vali
 * 	1.0v
 * 	9/01/2020
 */
/*
delta=b*b-4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)

*/

import com.Bridgelabz.utility.Utility;


import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a value");
		int a=scan.nextInt();
		System.out.println("Enter b value");
		int b=scan.nextInt();
		System.out.println("Enter c value");
		int c=scan.nextInt();
		double x1,x2;
		double delta;
		if(a!=0)
		{
			 delta=b*b-4*a*c;
		}
		else{
			System.out.println("Quadratic is not possible");
		}
		delta=b*b-4*a*c;
		if(delta>=0)
		{
			delta=Math.sqrt(delta);
			  x1= (-b + delta)/(2*a);
			  x2 = (-b - delta)/(2*a);
			  System.out.println("x1 is:"+x1);
			  System.out.println("x2 is:"+x2);
		}
		else{
			System.out.println("Root is not possible");
		}
	}

}
