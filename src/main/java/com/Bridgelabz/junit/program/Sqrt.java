package com.Bridgelabz.junit.program;

public class Sqrt {

	public static void main(String[] args) {
		double c=Double.parseDouble(args[0]);
		sqr(c);
	}

	public static double sqr(double c) {
		double epsilon=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
		return t;
	}

}
