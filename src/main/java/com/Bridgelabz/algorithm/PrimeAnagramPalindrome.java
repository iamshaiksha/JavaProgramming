package com.Bridgelabz.algorithm;
/*  prime numbers that are Anagram and Palindrome 
 *  @shaik shaiksha vali 
 * 	1.0v
 * 	10/01/20202
 */
public class PrimeAnagramPalindrome {

	public static void main(String[] args) {

		{
			System.out.println("prime palindrome numbers between 0 to 1000 are:");
			for(int i=0;i<1000;i++)
			{
				int reverse=0;
				int number=i;
				while(number!=0)
				{
					int remainder=number%10;
					reverse=reverse*10+remainder;
					number=number/10;
				}
				if(i==reverse)
				{
					boolean flag=false;
					for(int j=2;j<=i/2;j++)
					{
						if(i%j==0)
						{
							flag=true;
							
						}
					}
					if(!flag)
					{
						System.out.println(i);
					}
				}
			}
		}
	}


}


