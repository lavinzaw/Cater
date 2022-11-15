package org.JSON.Array;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {
	public static void main(String[] args) throws IOException, ParseException {
		
	
	FileReader reader=new FileReader
	("C:\\Users\\nesar\\eclipse-workspace\\APIday2\\src\\test\\resources\\JSON folder\\iInputFile.json");
	
	JSONParser jsonparse=new JSONParser();
	
	Object parse = jsonparse.parse(reader);
	
	JSONObject file=(JSONObject) parse;
	
	Object pagenumber = file.get("page");
	System.out.println(pagenumber);
	
	Object perpage = file.get("per_page");
	System.out.println(perpage);
	
	Object total = file.get("total");
	System.out.println(total);
	
	Object totalpage = file.get("total_pages");
	System.out.println(totalpage);
	
	Object data = file.get("data");
	
	JSONArray datas=(JSONArray) data;
	
	for (int i = 0; i < datas.size(); i++) {
		
		Object fulldata = datas.get(i);
		
		JSONObject getfulldatas=(JSONObject)fulldata;
		
		System.out.println(getfulldatas.get("id"));
		System.out.println(getfulldatas.get("email"));
		System.out.println(getfulldatas.get("first_name"));
		System.out.println(getfulldatas.get("last_name"));
		System.out.println(getfulldatas.get("avatar"));
		
		}
	
	
	
	}
	
	
	
	
	
}
