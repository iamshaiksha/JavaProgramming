package com.Bridgelabz.BasicCoreProgrammingtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.BasicCoreProgramming.PrimeFactors;

public class PrimeFactorsTest {

	@Test
	public void test() {
		int n=15;
		int p=PrimeFactors.PrimeFactoriztion(n);
		assertEquals(p, PrimeFactors.PrimeFactoriztion(n));
	}

}
