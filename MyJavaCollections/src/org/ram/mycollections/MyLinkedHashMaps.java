package org.ram.mycollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyLinkedHashMaps {
	
	public static void main(String args[]){
    	/*	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkemap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
       */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();

		//testMap(map);
		//testMap(linkedmap);
		testMap(treemap);
		
	}	
	
	public static void testMap(Map<Integer, String> map){ 	
		
		map.put(25, "Twenty Five");
		map.put(5, "Five");
		map.put(10, "Ten");
		map.put(1, "One");
		map.put(8, "Eight");
		map.put(3, "Three");

		
		for(Integer key: map.keySet() ){
			  String value = map.get(key);
			  
			  System.out.println(key + " : " + value);
		
	      }
	}
}
