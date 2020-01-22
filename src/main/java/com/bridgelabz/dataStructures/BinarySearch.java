package com.bridgelabz.dataStructures;

import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=5;
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int N[]=new int[n];
		N[0]=N[1]=1;
		//System.out.println(N[0]);
		System.out.println("Number of binary search tress for1:"+N[1]);
		for(int i=2;i<n;i++)
		{
			N[i]=0;
			for(int j=0;j<i;j++)
			{
			N[i]=N[i]+N[j]*N[i-j-1];
			
			}
			System.out.println("Number of binary search tress for"+i+":"+N[i]);
		}
		
	}

}
