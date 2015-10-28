package org.elsysbg.ip.java;

import java.util.Scanner;

public class CommandsHandler {
	public static void main(String[] args) {
		// Input:
		System.out.print("Enter command: ");
		final Scanner in = new Scanner(System.in);
		final String command = in.next();		
		// Processing:
		final int result = execute(command);		
		// Output:
		System.out.println("Result: " + result);
		in.close();
	}

	private static int execute(String command) throws IllegalArgumentException {
		final String[] split = command.split(":");
		// Better to implement in a spearate class
		if ("sum".equals(split[0])) {
			return Integer.valueOf(split[1]) + Integer.valueOf(split[2]);
		}
		throw new IllegalArgumentException("Unknown command: " + command);
	}
}