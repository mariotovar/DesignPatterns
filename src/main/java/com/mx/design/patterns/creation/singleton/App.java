package com.mx.design.patterns.creation.singleton;

public class App {

	public static void main(String[] args) {
	
		Connection c = null;		
		for (int i = 0; i < 10; i++) {
			c = Connection.getInstance();
			System.out.println(c);			
		}

	}
	
}