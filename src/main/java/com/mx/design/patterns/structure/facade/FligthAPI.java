package com.mx.design.patterns.structure.facade;

public class FligthAPI {
	
	public void searchFligth(String checkin, String checkout, String origin, String destiny) {
		System.out.println("==============================");
		System.out.println("To: " + destiny + " from: " + origin);
		System.out.println("Checkin: " + checkin + " Checkout " + checkout);
		System.out.println("==============================");
	}	

}
