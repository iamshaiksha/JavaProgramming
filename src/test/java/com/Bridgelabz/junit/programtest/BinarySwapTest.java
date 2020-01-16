package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.BinarySwap;

public class BinarySwapTest {

	@Test
	public void test() {

		int n=150;
		int binary=BinarySwap.swap(n);
		assertEquals(binary,BinarySwap.swap(n));
	
	}

}
