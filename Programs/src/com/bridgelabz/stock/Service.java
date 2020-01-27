package com.bridgelabz.stock;

import org.json.simple.JSONObject;

public interface Service {
	JSONObject createJsonFile() throws Exception;
	void displayItems();
	void calculate();
	void removeItem();
	void addShares();
	void addProducts();
	void companies();
	
}
