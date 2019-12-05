package com.mx.design.patterns.structure.bridge;

public class ShippingCompany {
	
	protected IShipping shipping;

    protected ShippingCompany(IShipping shipping){
    	this.shipping = shipping;
    }

    public void pickupPackage(){
        System.out.println("Package has been Picked up");
        shipping.proccessShipping();
    }

    public void shippingpackage(){
    	shipping.shipping();
    }

    public void deliveryPackage(){
    	shipping.proccessDelivery();
        System.out.println("Package has been Delivered");
    }
	
}
