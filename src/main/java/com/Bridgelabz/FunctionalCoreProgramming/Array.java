package com.Bridgelabz.FunctionalCoreProgramming;
/**  Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	8/01/2020
 */
import java.io.PrintWriter;

import com.Bridgelabz.utility.Utility;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows");
		int m=Utility.inputInt();
		System.out.println("Enter number of columns");
		int n=Utility.inputInt();
		int a[][]=arrayInt(m,n);
		double b[][]=arrayDouble(m,n);
		String [][] c  =arrayBoolean(m,n);
		
display(a);
display(b);
display(c);
	}

	private static void display(String[][] c) {
	
		System.out.println("the inserted elements in the String array are");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print((c[i][j])+" ");
			}
			System.out.println();
		}
	}

	private static String[][] arrayBoolean(int m, int n) {
		// TODO Auto-generated method stub
		String c[][]=new String[m][n];
		System.out.println("the elements inserting String array are");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=Utility.getString();
			}
		}
		return c;
		
		
	}

	private static void display(double[][] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print((b[i][j])+" ");
			}
			System.out.println();
		}
	
	}

	private static double[][] arrayDouble(int m, int n) {
		
		double b[][]=new double[m][n];
		System.out.println("the elements inserting double are");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=Utility.inputInt();
			}
		}
		return b;
	}

		
	

	private static void display(int[][] a) {
		
		System.out.println("the inserted elements in the array are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print((a[i][j])+" ");
			}
			System.out.println();
		}
	
		
		
	}

	private static int[][] arrayInt(int m, int n) {
		// TODO Auto-generated method stub
		int a[][]=new int[m][n];
		System.out.println("the elements inserting integer array are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=Utility.inputInt();
			}
		}
		return a;
	}

}
