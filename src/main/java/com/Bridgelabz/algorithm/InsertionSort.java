package com.Bridgelabz.algorithm;



import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		  int i,j;
		  String key;
		  System.out.println("Enter the siz of an array");
		  int n=Utility.inputInt();
		  String[] inputArray = Utility.input1DstringArray(n);
		  System.out.println(Arrays.toString(inputArray));
		  for (i = 1; i < inputArray.length; i++) { //the condition has changed
		    key = inputArray[i];
		    j = i - 1;
		    while (j >= 0) {
		      if (key.compareTo(inputArray[j]) > 0) {//here too
		        break;
		      }
		      inputArray[j + 1] = inputArray[j];
		      j--;
		    }
		    
		    inputArray[j + 1] = key;
		    System.out.println(Arrays.toString(inputArray));
		  }
		  System.out.println(Arrays.toString(inputArray));
		  
		/************************************************************
		 *******FOR INTEGERS**************
		 System.out.println("Enter the size of an array");
		int size=Utility.inputInt();
		int a[]=new int[size];
		generateArray(a);
		System.out.println("Array before sort");
		PrintArray(a);
		System.out.println();
		System.out.println("After sorting a array");
		afterSorting(a);
		


	}

	private static void afterSorting(int[] a) {

		int temp,j;
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];    
			j=i;
			while(j>0&&a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
				
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}


	private static void PrintArray(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}


	}

	private static int[] generateArray(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		return a;
		*********************************************************************/
	}

}
