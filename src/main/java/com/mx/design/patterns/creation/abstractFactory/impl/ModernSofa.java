package com.mx.design.patterns.creation.abstractFactory.impl;

import com.mx.design.patterns.creation.abstractFactory.ISofa;

public class ModernSofa implements ISofa{

	public boolean hasLegs() {
		System.out.println("ModernSofa hasLegs");
		return false;
	}

	public void sitOn() {
		System.out.println("ModernSofa sitOn");		
	}
	
}
