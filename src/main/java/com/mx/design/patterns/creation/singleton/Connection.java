package com.mx.design.patterns.creation.singleton;

public class Connection {

	private static Connection instancia;

	private Connection() {
		
	}
	
	public static Connection getInstance() {
		if(instancia == null) {
			instancia = new Connection();
		}
		return instancia;
	}
	
}
