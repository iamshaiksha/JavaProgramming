package com.bridgelabz.dataStructures;

import java.text.*;
import java.util.*;

public class Calender {

	public static void main(String[] args) {

		Date date=new Date();
		SimpleDateFormat month=new SimpleDateFormat("m");
		SimpleDateFormat current_year=new SimpleDateFormat("yyyy");
		String week[]=new String[7];
		week[0]="sun";
		week[1]="mon";
		week[2]="tue";
		week[3]="wed";
		week[4]="thu";
		week[5]="fri";
		week[6]="sat";
		int count_year; 
		int count_day=0;
		int mnth=0;
		try
		{
			mnth=Integer.parseInt(args[0]);
		}
		catch(Exception e) {
			mnth=Integer.parseInt(month.format(date));
		}
		int year=0000;
		int startweek_day;
		try
		{
			year=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			year=Integer.parseInt(current_year.format(date));
		}
		System.out.println("\n\n\t\t......calender of"+month+","+year+"......\n\n\t\t");
		System.out.println(args[0]+"=month");
		System.out.println(args[1]+"=year");
        System.out.print("\t");
		for(int i=0;i<7;i++)
		{
			System.out.print(week[i]+"\t");
		}
		System.out.println("\n");

		int week_no=1; 
		int month_day[];	
	 month_day=new int[12];
		int count_leap_year=0;
		month_day[0] = 31;
		month_day[1] = 28;
		month_day[2] = 31;
		month_day[3] = 30;
		month_day[4] = 31;
		month_day[5] = 30;
		month_day[6] = 31;
		month_day[7] = 31;
		month_day[8] = 30;
		month_day[9] = 31;
		month_day[10]= 30;
		month_day[11]= 31;
		if(year%4==0)
		{
			month_day[1]=29;
		}
		else
		{
			month_day[1]=28;
		}
		if(year<2011)
		{
			count_year=2011-year-1;
			for(int j=12;j>=mnth;j--)
			{
				count_day=count_day+month_day[j-1];
			}
			for(int j=2010;j>	year;j--)
			{
				if(j%4==0)
					count_leap_year++;
			}
			count_day=(count_year*365)+count_leap_year;
			startweek_day=7-(count_day%7);
		}
		else
		{
			count_year=year-2011;
			for(int j=1;j<mnth;j++)
			{
				count_day=count_day+month_day[j-1];
			}
			for(int j=2011;j<year;j++)
			{
				if(j%4==0) 
					
					count_leap_year++;
			}
			count_day=count_day+(count_year*365)+count_leap_year;
			startweek_day=(count_day%7);
			if(startweek_day==0)startweek_day=7;
		}
		for(int k=1;k<startweek_day;k++)System.out.print("\t");
		week_no=startweek_day;
		for(int i=1;i<=month_day[mnth-1];i++)
		{
			if((week_no%7)==0) { 
				week_no=0;
				System.out.println("\t"+i);
			}
			else 
				System.out.print("\t"+i);
			week_no++;
			
		}


	}
}
