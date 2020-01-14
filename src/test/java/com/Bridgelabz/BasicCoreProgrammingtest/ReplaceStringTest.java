package com.Bridgelabz.BasicCoreProgrammingtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.BasicCoreProgramming.ReplaceString;

public class ReplaceStringTest {

	@Test
	public void test() {
		String userName2="shaiksha";
		String p=ReplaceString.StringReplace(userName2);
		assertEquals(p,ReplaceString.StringReplace(userName2) );
	}

}
