package com.Bridgelabz.BasicCoreProgrammingtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.BasicCoreProgramming.Powerof2;

public class Powerof2Test {

	@Test
	public void test() {
		int n=2;
		int p=Powerof2.power(n);
		assertEquals(p,Powerof2.power(n));
	}

}
