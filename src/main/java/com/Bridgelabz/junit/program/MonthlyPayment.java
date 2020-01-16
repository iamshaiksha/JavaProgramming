package com.Bridgelabz.junit.program;

public class MonthlyPayment {

	public static void main(String[] args) {

			
		//System.out.println("set P value in command line");
		int principal=Integer.parseInt(args[0]);
		//System.out.println("set y value in command line");
		int year=Integer.parseInt(args[1]);
		//System.out.println("set R value in command line");
		int rate=Integer.parseInt(args[2]);
		monthlyPayment(principal,year,rate);
	}

	public static double monthlyPayment(double principal, double year, double rate) {
		double n=12*year;
		double r=(rate/(12*100));
		
		
		double payment=(principal*r)/(1-Math.pow(1+r,-n));
		System.out.println("Payment is"+payment);
		return payment;
		
		
		
		
		
		
	}

}
