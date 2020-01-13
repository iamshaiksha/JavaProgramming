package com.Bridgelabz.algorithm;

import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class Bubblesort {

	public static void main(String[] args) {
		System.out.println("Enter a 1D array");
		int n=Utility.inputInt();
		int a[]=Utility.input1dArray(n);
		Bubblesort(a,n);
		System.out.println(Arrays.toString(a));
	}

	private static int[] Bubblesort(int[] a, int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
							
				}
			}
		}
		
		
		return a;
	}

}
