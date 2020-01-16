package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.TemparatureConversion;

public class TemparatureConversionTest {

	@Test
	public void test() {
		double f=98;
		double c=TemparatureConversion.celsius(f);
		assertEquals(c, TemparatureConversion.celsius(f));
	}

}
