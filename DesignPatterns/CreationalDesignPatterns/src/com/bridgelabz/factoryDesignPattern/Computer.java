package com.bridgelabz.factoryDesignPattern;
/**Factory design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public abstract class Computer {
	public abstract String getCPU();
	public abstract String getRAM();
	public abstract String getHDD();
	 
	public String toString()
	{	
		
		return "RAM="+this.getRAM()+",HDD="+this.getHDD()+",CPU="+this.getCPU();
		
	}
}
