package com.Bridgelabz.BasicCoreProgramming;
/** Leap year
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */

import com.Bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter a year");
		int year=Utility.inputInt();
		if(year%4==0)
		{
			
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("It is a leap year");
				}
				else
				{
					System.out.println("Not a leap year");
				}
			}
			else
			{
				System.out.println("not a leap year");
			}
			
		}
		else
		{
		System.out.println("Not a leap year");
		}
	}

}
