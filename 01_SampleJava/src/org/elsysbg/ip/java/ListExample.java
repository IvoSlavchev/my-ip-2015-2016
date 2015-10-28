package org.elsysbg.ip.java;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		// Create list
		final List<String> invited = new LinkedList<String>();
		
		// Add elements
		invited.add("Pesho");
		invited.add("Spiridon");
		
		// Iterator
		for (String name : invited) {
			System.out.println(name + " is invited");
		}

		// Get size
		System.out.println("All invited: " + invited.size());
		
		// Remove element
		invited.remove("Pesho");		
		System.out.println("Pesho is no longer invited");
		
		for (String name : invited) {
			System.out.println(name + " is invited");
		}
		System.out.println("All invited: " + invited.size());
	}
}