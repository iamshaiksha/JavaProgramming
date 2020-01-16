package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.ToBinary;

public class ToBinaryTest {

	@Test
	public void test() {

	int n=5;
	int binary=ToBinary.binary(n);
	assertEquals(n,binary);
	
	
	
	}

}
