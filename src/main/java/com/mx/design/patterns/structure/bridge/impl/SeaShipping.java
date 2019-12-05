package com.mx.design.patterns.structure.bridge.impl;

import com.mx.design.patterns.structure.bridge.IShipping;

public class SeaShipping implements IShipping{

    public void proccessShipping(){
    	System.out.println("Package has been loaded on ship");
    }

    public void shipping(){
    	System.out.println("Package in over the sea");
    }

    public void proccessDelivery(){
    	System.out.println("Package has been downloaded in the port");
    }
 
}

