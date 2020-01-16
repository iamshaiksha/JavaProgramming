package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.Sqrt;

public class SqrtTest {

	@Test
	public void test() {
	double c=10;
	double t=Sqrt.sqr(c);
	assertEquals(t,Sqrt.sqr(c));
	}

}
