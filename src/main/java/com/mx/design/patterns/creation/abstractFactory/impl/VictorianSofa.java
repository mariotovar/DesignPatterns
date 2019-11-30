package com.mx.design.patterns.creation.abstractFactory.impl;

import com.mx.design.patterns.creation.abstractFactory.ISofa;

public class VictorianSofa implements ISofa{

	public boolean hasLegs() {
		System.out.println("VictorianSofa hasLegs");
		return false;
	}

	public void sitOn() {
		System.out.println("VictorianSofa sitOn");		
	}

}
