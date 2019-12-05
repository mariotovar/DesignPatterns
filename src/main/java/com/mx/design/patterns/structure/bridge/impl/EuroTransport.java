package com.mx.design.patterns.structure.bridge.impl;

import com.mx.design.patterns.structure.bridge.ShippingCompany;
import com.mx.design.patterns.structure.bridge.IShipping;

public class EuroTransport extends ShippingCompany{

    public EuroTransport(String nif){
        super(new AirShipping());
    }

    public EuroTransport(String nif, IShipping envio){
    	super(envio);
    }


}
