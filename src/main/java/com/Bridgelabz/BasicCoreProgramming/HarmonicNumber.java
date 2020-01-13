 package com.Bridgelabz.BasicCoreProgramming;
 /** Nth harmonic number
  *  @shaik shaiksha vali 
  * 	1.0v
  * 	8/01/2020
  */
import com.Bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
			System.out.println("Enter harmonic value");
			float number=Utility.inputInt();
			
			System.out.println(harmonicNumber(number));
			
	}

	private static float harmonicNumber(float number) {
		// TODO Auto-generated method stub
		float h1=(float)1.0;
		for(int i=2;i<=number;i++)
		{
			h1=h1+(float)1/i;// // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
			
		}
		return h1;
	}

}
