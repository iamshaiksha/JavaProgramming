package com.Bridgelabz.FunctionalCoreProgramming;
/*  Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int x=Integer.parseInt(args[0]);
				int y=Integer.parseInt(args[1]);

			        // compute distance to (0, 0)
			        double dist = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));//Math.sqrt((x*x)+(y*y))
			 
			        // output distance
			        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		;
			}

		


	}


