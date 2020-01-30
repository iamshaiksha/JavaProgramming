package com.bridgelabz.factoryDesignPattern;
/**Factory design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class Server extends Computer{
private String cpu;
private String ram;
private String hdd;
public Server(String cpu,String ram,String hdd)
{
	this.cpu=cpu;
	this.hdd=hdd;
	this.ram=ram;
}
@Override
public String getCPU() {
	return this.cpu=cpu;
	
	
}
@Override
public String getRAM() {
	
	return this.ram=ram;
}
@Override
public String getHDD() {
	return this.hdd=hdd;
}

}
