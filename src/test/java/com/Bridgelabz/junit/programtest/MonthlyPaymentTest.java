package com.Bridgelabz.junit.programtest;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Bridgelabz.junit.program.MonthlyPayment;

public class MonthlyPaymentTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		double principal=400;
		double year=1;
		double rate=2;
		double payment=MonthlyPayment.monthlyPayment(principal, year, rate);
		assertEquals(payment,MonthlyPayment.monthlyPayment(principal, year, rate));
		
	}

}
