package com.bridgelabz.prototype;
/**Prototype design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
public class PrototypeSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs=new BookShop();
		bs.setShopName("bridgelabz");
		bs.loadData();
		System.out.println(bs);
		//deep cloning:one object should not effect the other object
		System.out.println("*******************");
		BookShop bs1= bs.clone();
		bs1.setShopName("RGM");
		bs1.getBooks().remove(2);
		System.out.println(bs1);
	}

}
