package com.mx.design.patterns.structure.bridge.impl;

import com.mx.design.patterns.structure.bridge.IShipping;

public class AirShipping implements IShipping{

    public void proccessShipping(){
    	System.out.println("Package has been loaded on plane");
    }

    public void shipping(){
    	System.out.println("Package on air");
    }

    public void proccessDelivery(){
    	System.out.println("Package has been downloaded in the airpoint");
    }

}