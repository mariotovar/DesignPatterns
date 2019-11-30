package com.mx.design.patterns.creation.abstractFactory.impl;

import com.mx.design.patterns.creation.abstractFactory.IChair;

public class ModernChair implements IChair{

	public boolean hasLegs() {
		System.out.println("ModernChair hasLegs");
		return false;
	}

	public void sitOn() {
		System.out.println("ModernChair sitOn");		
	}
	
}
