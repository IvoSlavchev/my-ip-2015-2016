package org.elsysbg.ip.java;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
	public static void main(String[] args) {
		// Create map
		final Map<String, Integer> nameToCountMap = new HashMap<String, Integer>();
		
		// Add element
		nameToCountMap.put("Pesho", 1);
		
		// Get element by key
		System.out.println(nameToCountMap.get("Pesho"));

		// NULL returned when element doesn't exist
		if (nameToCountMap.get("Unknown") == null) {
			System.out.println("Not found");
		}
	}
}