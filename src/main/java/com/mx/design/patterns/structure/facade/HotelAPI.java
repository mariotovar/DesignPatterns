package com.mx.design.patterns.structure.facade;

public class HotelAPI {
	
	public void searchHotels(String checkin, String chekout, String origin, String destiny) {
		System.out.println("==============================");
		System.out.println("Hotels");
		System.out.println("Checkin: " + checkin + " Checkout: " + chekout);
		System.out.println("Hotel A");
		System.out.println("Hotel B");
		System.out.println("Hotel C");
		System.out.println("==============================");
	}	

}
