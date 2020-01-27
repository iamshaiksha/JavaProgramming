package com.bridgelabz.stock;

public class StockDetails {
	private String shareName;
	private long numOfShares;
	private long sharePrice;
	public String getName() {
		return shareName;
	}
	public void setName(String name) {
		this.shareName = name;
	}
	public long getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(long weight) {
		this.numOfShares = weight;
		System.out.println(weight+"---->");
	}
	public long getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(long price) {
		this.sharePrice = price;
	}
	
	@Override
	public String toString() {
		return "InventoryDetails [name=" + shareName + ", weight=" + numOfShares + ", price=" + sharePrice + "]";
	}
	
}
	
	
	
	

