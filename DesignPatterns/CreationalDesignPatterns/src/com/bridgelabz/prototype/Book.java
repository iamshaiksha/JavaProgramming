package com.bridgelabz.prototype;
/**
 * 
 * prototype design pattern 
 * @author shaikshavali shaik
 * date:30/01/2020
 */
public class Book {
private int bid;
private String bname;
public int getBid() {
	return bid;
}
public void setBid(int i) {
	this.bid = i;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + "]";
}

	
}
