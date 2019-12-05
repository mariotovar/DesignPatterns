package com.mx.design.patterns.structure.bridge;

import com.mx.design.patterns.structure.bridge.impl.SeaShipping;
import com.mx.design.patterns.structure.bridge.impl.EuroTransport;

public class App {

	public static void main(String[] args) {
        
        // Default Air Shipping
		ShippingCompany massageAir;
		massageAir = new EuroTransport("0854752177");
		massageAir.pickupPackage();
		massageAir.shippingpackage();
		massageAir.deliveryPackage();
        
        System.out.println("--------------------------------------");
        
        // Sea Shipping
        ShippingCompany massageShip;
        massageShip = new EuroTransport("0854752177", new SeaShipping());
        massageShip.pickupPackage();
        massageShip.pickupPackage();
        massageShip.deliveryPackage();
		
	}

}
