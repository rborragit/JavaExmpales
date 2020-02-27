package org.ram.mycollections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMaps {
	
	public static void main(String args[]){
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(25, "Twenty Five");
		map.put(5, "Five");
		map.put(10, "Ten");
		map.put(1, "One");
		map.put(8, "Eight");
		map.put(3, "Three");
		
		//Single item Retrival...
		//map.put(8, "Override");
		//String text = map.get(8);
		//System.out.print(text);
		
		//Iterate throught maps elements
		
		for(Map.Entry<Integer, String> entry: map.entrySet() ){
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
	}

}
