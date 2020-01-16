package com.Bridgelabz.junit.program;

public class BinarySwap {

	public static void main(String[] args) {
		int n=150;
		System.out.println(swap(n));
		
		
		
		
	}

	public static int  swap(int n) {
		
		return ((n&0x0F)<<4|(n&0x0F)>>4);
		
	}

}
