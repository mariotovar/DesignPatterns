package com.mx.design.patterns.creation.abstractFactory.impl;

import com.mx.design.patterns.creation.abstractFactory.IChair;

public class VictorianChair implements IChair{

	public boolean hasLegs() {
		System.out.println("VictorianChair hasLegs");
		return false;
	}

	public void sitOn() {
		System.out.println("VictorianChair sitOn");		
	}

}
