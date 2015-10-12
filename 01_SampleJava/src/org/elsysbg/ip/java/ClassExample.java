package org.elsysbg.ip.java;

public class ClassExample {

	public static void main(String[] args) {
	
		final Room room = new Room();
		// room = new Room(); final keyword error

		room.setHeight(20);
		room.setWidth(10);
		
		final int height = room.getHeight();
		
		System.out.println(height);
		System.out.println(room.getWidth());
		System.out.println(room.calculateArea());
	}
}