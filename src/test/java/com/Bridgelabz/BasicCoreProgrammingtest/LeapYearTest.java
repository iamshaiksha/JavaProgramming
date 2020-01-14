package com.Bridgelabz.BasicCoreProgrammingtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.BasicCoreProgramming.LeapYear;

public class LeapYearTest {

	@Test
	public void test() {
		int year=1600;
		int l=LeapYear.leapYear(year);
		assertEquals(l,LeapYear.leapYear(year));
	}

}
