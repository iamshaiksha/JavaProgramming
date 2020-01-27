package com.bridgelabz.stock;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class FileAcess {

	

	public static void writeIntoFile(JSONArray array) throws IOException {

		
		FileWriter fw=new FileWriter("StockWritten.json");
		fw.write(array.toJSONString());
		fw.flush();
		fw.close();
		System.out.println("File copied...!");
	}

	public static JSONArray readFile() {
		JSONParser jsonParser = new JSONParser();
		FileReader reader=null;
		JSONArray obj = null;
		try {
			reader = new FileReader("StockWritten.json");
			obj = (JSONArray) jsonParser.parse(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Read JSON file
		return obj;
		
		
	
	}

}
