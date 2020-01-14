package com.Bridgelabz.algorithm;

import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class GuessNumber{


	public static void main(String[] args) {
		System.out.println("Enter the range of your number");
		int range=Utility.inputInt();

		int a[]=new int[range];
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=i+1;
		}
		System.out.println(Arrays.toString(a));
		guessing(a);
	}

	public static void guessing(int[] a) {
		int lo=0;
		int hi=a.length-1;

		while(lo<=hi){
			int m=lo+hi/2;
			System.out.println("if"+a[m]+"is your number enter Y else N");
			String x=Utility.getString();
			if(x.equalsIgnoreCase("N"))
			{
				System.out.println("if"+a[m]+"is greater than your mid number enter Y or N");
				String y=Utility.getString();
				if(y.equalsIgnoreCase("Y"))
				{
					lo=m+1;
				}
				else
				{
					hi=m-1;
				}

			}
			else
			{
				System.out.println("congrajulations your number is "+a[m]);
				break;
			}




		}

	}

}

