package com.Bridgelabz.junit.programtest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bridgelabz.junit.program.VendingMachine;


public class VendingMachineTest {

	@Test
	public void test() {
		int money=150;
		int notes[]={100,50};
	int totalNotes=VendingMachine.findTotalNotesusingRec(money,notes);
	
	assertEquals(totalNotes,VendingMachine.findTotalNotesusingRec(money,notes));
		
	}

}
