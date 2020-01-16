package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.DayofWeek;

public class DayofWeekTest {

	@Test
	public void test() {
		int year=2020;
		int month=01;
		int date=14;
		int day= DayofWeek.finday(year, month, date);
		assertEquals(day,DayofWeek.finday(year, month, date));
	}

}
