package com.Bridgelabz.logicalPrograms;
 /** generate coupon number
  *  @Shaik Shaiksha vali
  *  1.0v
  *  9/01/2020
  */


import java.util.ArrayList;
import java.util.Random;

import com.Bridgelabz.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		

		ArrayList<Integer> couponList=new ArrayList<>();
		System.out.println("enter no of coupons");
		int count=Utility.inputInt();
		Random random=new Random();
		for(int i=0;i<count;i++)
		{
			int couponNumber=random.nextInt(10000);
			System.out.println(couponNumber);
			if(!couponList.contains(couponNumber))
			{
				couponList.add(couponNumber);
			}
		}
		for(int i=0;i<couponList.size();i++) {
			System.out.println("coupon number:"+couponList.get(i));


		}

	}
}