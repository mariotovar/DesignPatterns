package com.mx.design.patterns.creation.abstractFactory;

import com.mx.design.patterns.creation.abstractFactory.impl.VictorianChair;
import com.mx.design.patterns.creation.abstractFactory.impl.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

	public ISofa createSofa() {
		return new VictorianSofa();
	}

	public IChair createChair() {
		return new VictorianChair();
	}

}
