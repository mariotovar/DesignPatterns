package com.mx.design.patterns.structure.facade;

public class CheckFacade {
	
	private HotelAPI hotelAPI;	
	private FligthAPI fligthAPI;
	
	public CheckFacade() {
		hotelAPI = new HotelAPI();
		fligthAPI = new FligthAPI();
	}
	
	public void search(String checkin, String checkout, String origin, String destiny) {
		fligthAPI.searchFligth(checkin, checkout, origin, destiny);
		hotelAPI.searchHotels(checkin, checkout, origin, destiny);
	}	

}
