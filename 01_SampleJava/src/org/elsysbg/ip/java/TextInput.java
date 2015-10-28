package org.elsysbg.ip.java;

import java.util.Scanner;

public class TextInput {

	public static void main(String[] args) {
		System.out.print("Enter name: ");	
		// Scanner can be relpaced with BufferedReader, DataInputStream, 
		// ObjectInputStream and others
		final Scanner in = new Scanner(System.in);		
		final String name = in.next();
		System.out.printf("Hi, %s", name);
		// Closing the scanner
		in.close();
	}
}