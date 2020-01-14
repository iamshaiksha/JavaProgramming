package com.Bridgelabz.algorithm;

import java.util.Arrays;

import com.Bridgelabz.utility.Utility;

public class GenericsSearchSort {

	public static void main(String[] args) {
		int ch=0;
		do{
			System.out.println("***************MENU FOR SEARCHING AND SORTING***********");
			System.out.println("Binary search for integer");
			System.out.println("Binary search for String");
			System.out.println("sorting");
			System.out.println("enter your choice");
			int choice=Utility.inputInt();
			switch (choice)
			{
			case 1:
				System.out.println("program for binary search of an integer");
				System.out.println("Enter the size of an array");
				int size=Utility.inputInt();
				int a[]=Utility.input1dArray(size);
				
				Arrays.sort(a);
				Utility.print1DArray(a);
				System.out.println("Enter a element you want to search");
				int element=Utility.inputInt();
				int key=Utility.binarySearchInt(a,element);
				if(key==-1)
				{
					System.out.println("Not found");
				}
				else
				{
					System.out.println(" found at"+key+"position");
				}
				break;
				
				
			case 2:
				System.out.println("Binary search for String");
				
				System.out.println("Enter the size of an array");
				int n=Utility.inputInt();
				String s[]=Utility.input1DstringArray(n);
				Arrays.sort(s);
				Utility.print1DStringArray(s);
				System.out.println("Enter a element you want to search");
				String word=Utility.getString();
				int pos=Utility.binarysearch(word,s);
				if(pos==-1)
				{
					System.out.println("Not found");
				}
				else
				{
					System.out.println(" found at"+pos+"position");
				}
			case 3:
				System.out.println("bubble sort for integers");
				System.out.println("Enter the size of an array");
				int m=Utility.inputInt();
				int b[]=Utility.input1dArray(m);
				Utility.print1DArray(b);
				int bsort[]=Utility.bubblesort(b,m);
				System.out.println("bubble sort"+Arrays.toString(bsort));
			case 4:
				System.out.println("insertion sort for integers");
				System.out.println("Enter the size of an array");
				int siz=Utility.inputInt();
				int i[]=Utility.input1dArray(siz);
				Utility.print1DArray(i);
				int isort[]=Utility.insertionsort(i,siz);
				
				System.out.println("insertion sort="+Arrays.toString(isort));
			case 5:
				System.out.println("selection sort for integers");
				System.out.println("Enter the size of an array");
				int n1=Utility.inputInt();
				int se[]=Utility.input1dArray(n1);
				Utility.print1DArray(se);
				int selectionSort[]=Utility.selectsort(se,n1);
				System.out.println("selection sort="+Arrays.toString(selectionSort));
			case 6:
				System.exit(0);
				
			}
		}while(ch<=5);
		
	
		
		
		
		
		
		
		
	}

}
