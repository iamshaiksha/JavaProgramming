package com.bridgelabz.factoryDesignPattern;
/**Factory design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class PC extends Computer {
private String cpu;
private String ram;
private String hdd;

public PC(String cpu,String ram,String hdd)
{
	this.cpu=cpu;
	this.hdd=hdd;
	this.ram=ram;
}
	
	public String getCPU() {
		return this.cpu;
	}

	
	public String getRAM() {
		return this.ram;
	}

	
	public String getHDD() {
		return this.hdd;
	}

}
