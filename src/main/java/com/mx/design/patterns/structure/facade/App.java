package com.mx.design.patterns.structure.facade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade client1 = new CheckFacade();
		client1.search("02/07/2018", "08/07/2018", "Lima", "Cancún");
		
		CheckFacade client2 = new CheckFacade();
		client2.search("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
