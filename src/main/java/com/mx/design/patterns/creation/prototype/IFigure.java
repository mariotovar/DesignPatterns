package com.mx.design.patterns.creation.prototype;

public interface IFigure extends Cloneable {
	
	String getName();
	void setName(String name);
	void getPosition();
	void move(int x, int y);
	IFigure clone();	


}
