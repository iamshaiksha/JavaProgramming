package com.Bridgelabz.junit.program;

import com.Bridgelabz.utility.Utility;

public class VendingMachine {
	static int i = 0;
	static int totalNotes = 0;
	
	public VendingMachine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int money = Utility.inputInt();// 9500
		// int totalNumberOfNotes=findTotalNotesusingFor(money,notes);
		// System.out.println("totalNumberOfNotes="+totalNumberOfNotes);
		findTotalNotesusingRec(money, notes);
		System.out.println("total notes: " + totalNotes);

	}

	public static int findTotalNotesusingRec(int money, int[] notes) {
		if (money == 0) {
			return -1;
		} else {
			if (money >= notes[i]) {
				int numberOfNotes = money / notes[i];
				money = money % notes[i];
				System.out.println(notes[i] + " notes->" + numberOfNotes);
				totalNotes += numberOfNotes;
			}
			i++;
			return findTotalNotesusingRec(money, notes);
		}
	}

	/*
	 * private static int findTotalNotesusingFor(int money, int[] notes) { int
	 * totalNotes=0; for (int i = 0; i < notes.length; i++) {
	 * if(money>=notes[i]){ int numberOfNotes=money/notes[i];//9500/1000->9
	 * money=money%notes[i];//9500%1000->500 System.out.println(notes[i]+
	 * " notes->"+numberOfNotes); totalNotes+=numberOfNotes; } }
	 * 
	 * return totalNotes; }
	 */

}

