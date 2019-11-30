package com.mx.design.patterns.creation.abstractFactory;

import com.mx.design.patterns.creation.abstractFactory.impl.ModernChair;
import com.mx.design.patterns.creation.abstractFactory.impl.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {

	public ISofa createSofa() {
		return new ModernSofa();
	}

	public IChair createChair() {
		return new ModernChair();
	}
	
}
