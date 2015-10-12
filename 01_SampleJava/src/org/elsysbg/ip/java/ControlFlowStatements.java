package org.elsysbg.ip.java;

public class ControlFlowStatements {

	public static void main(String[] args) {
		ifExample();
		// Create method definition
		forExample();
	}

	private static void forExample() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	// Extracted to method
	private static void ifExample() {
		if (true) {
			System.out.println("Called.");
		}
		
		if (1 > 2) {
			System.out.println("Not called.");
		} else {
			System.out.println("Called.");
		}
	}
}