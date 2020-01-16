package com.Bridgelabz.junit.program;

import com.Bridgelabz.utility.Utility;

public class DayofWeek {

	public static void main(String[] args) {
		System.out.println("enter a year");
		int year=Utility.inputInt();
		System.out.println("Enter the month between (1-12)");
		int month=Utility.inputInt();
		System.out.println("Enter a date");
		int date=Utility.inputInt();


		finday(year,month,date);
		/*************formulae to find day********
				int	y0 = year−(14−month) / 12;
				int x = y0 + y0/4 − y0/100 + y0/400;
				int m0 = m + 12 × ((14 − m) / 12) − 2;	
				int d0 = (d+x+ 31m0/12)%7;

		 */
	}


	public static int finday(int year, int month, int date) {





		int yo=year-(14-month)/12;
		int x=yo+yo/4-yo/100+yo/400;
		int mo=month+12*((14-month)/12)-2;
		int d=(date+x+31*mo/12)%7;
		if(d==0)
		{
			System.out.println("day="+d+"is sunday");
		}

		if(d==1)
		{
			System.out.println("day="+d+" "+"is monday");
		}
		if(d==2)
		{
			System.out.println("day="+d+" "+"is tuesday");
		}
		if(d==3)
		{
			System.out.println("day="+d+" "+"is wednesday");
		}

		if(d==4)
		{
			System.out.println("day="+d+" "+"is thursday");
		}

		if(d==5)
		{
			System.out.println("day="+d+" "+"is friday");
		}
		if(d==6)
		{

			System.out.println("day="+d+" "+"is saturday");


		}
		return d;
		
	}
}
