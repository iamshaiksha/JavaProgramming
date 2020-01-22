package com.Bridgelabz.utility;
/** Created by: Shaik shaiksha vali
 * Date: 8/01/2020
 * Purpose: Putting Commonly used function in single file.
	1 function to take word,integer and double as input
	2: function to read and write file.

 **/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.dataStructures.Node;
import com.bridgelabz.dataStructures.Node1;




public class Utility {
	Node2 next;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";
	public static Scanner scan=new Scanner(System.in);
	Node2 head;
	public static String getString()
	{
		return scan.next();
	}
	public static int inputInt()
	{
		return scan.nextInt();
	}
	public static boolean getBoolean()
	{
		return scan.nextBoolean();
	}
	public static double getDouble()
	{
		return scan.nextDouble();
	}
	public static float getFloat()
	{
		return scan.nextFloat();
	}
	public static int[] input1dArray(int n) {
		// TODO Auto-generated method stub
		int a[]=new int[n];
		System.out.println("Enter the one D array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		return a;
	}
	public static void print1DArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static String print1DStringArray(String array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		return "";
	}
	public static String[] input1DstringArray(int n) {
		String b[]=new String[n];
		System.out.println("Enter the one D string Array elemnets");
		for(int i=0;i<b.length;i++)
		{
			b[i]=Utility.getString();
		}	
		return b;
	}
	public static int binarysearch(String word, String[] b) {

		int first = 0;
		int last  = b.length;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (word.compareTo(b[mid]) < 0) {
				last = mid;

			}

			else if (word.compareTo(b[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}		
		return -1;
	}




	public static int binarySearchInt(int a[],int element) {


		int first=0;
		int last=a.length-1;

		int mid = (first + last)/2;  
		while( first <= last ){  
			if ( element>a[mid]){  
				first = mid + 1;     
			}else if ( a[mid] == element ){  
				System.out.println("Element is found at index: " + mid);  
				break;  
			}else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  
		if ( first > last ){  
			System.out.println("Element is not found!");  
		}
		return mid; 	
	}
	public static int[] bubblesort(int[] b, int n) {



		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(b[j-1]>b[j])
				{
					int temp=b[j-1];
					b[j-1]=b[j];
					b[j]=temp;

				}
			}
		}


		return b;
	}
	public static int[] insertionsort(int[] is, int siz) {
		int temp,j;
		for(int i=0;i<is.length;i++)
		{
			temp=is[i];    
			j=i;
			while(j>0&&is[j-1]>temp)
			{
				is[j]=is[j-1];
				j=j-1;

			}
			is[j]=temp;
		}
		for(int i=0;i<is.length;i++)
		{
			System.out.println(is[i]);
		}


		return is;
	}
	public static int[] selectsort(int[] se, int n1) {

		for (int i = 0; i < n1-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n1; j++)
				if (se[j] < se[min_idx])
					min_idx = j;

			int temp = se[min_idx];
			se[min_idx] = se[i];
			se[i] = temp;



			
		}
		return se;

	}

		

    public static boolean isPrime(int x){
        boolean itIs = true;
        for (int i = 2; i < x; i++){
            if(x%i == 0){
                itIs = false;  
            }
        }
        return itIs;
		
	}
	public boolean areAnagram(char[] x, char[] y) {
		Arrays.sort(x);
		Arrays.sort(y);
	String	string1=new String(x);
		String string2=new String(y);
		if(string1.equals(string2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void add(String data ) {
		Node2 nod = new Node2();
		nod.data = data;
		nod.next = null;
		if (head == null) {
			head = nod;
		} else { 
			Node2 n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nod;
		}
	}
	public String display() {
		Node2 node = head; // taking the head pointer
        String data=" ";
		while (node.next != null) {
			//System.out.println(node.data);
            data=node.data+" "+data;
			node = node.next;
			
		}
		//System.out.println(node.data+"@@@@"); //printing the last node data
       return data;
		
		
		
	}
	
}
