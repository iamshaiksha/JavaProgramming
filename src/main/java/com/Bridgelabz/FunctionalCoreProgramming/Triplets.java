package com.Bridgelabz.FunctionalCoreProgramming;
 /**Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. 
  	 Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
	 w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
  *  @Shaik Shaiksha vali
  *  1.0v
  *  9/01/2020
  */

import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility Utility= new Utility();
		System.out.println("Enter array size ");
		int n=Utility.inputInt();
		int arr[]=Utility.input1dArray(n);
		int m=arr.length;
		sumOfTriplets(arr,m); 
	}

	private static void sumOfTriplets(int[] arr, int m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m-2;i++)
		{
			for(int j=i+1;j<m-1;j++)
			{
				for(int k=j+1;k<m;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println("sum of triplets are");
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						
					}
				}
					
			}
		}
		
	}

}
