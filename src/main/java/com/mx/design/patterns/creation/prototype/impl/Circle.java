package com.mx.design.patterns.creation.prototype.impl;

import com.mx.design.patterns.creation.prototype.IFigure;

public class Circle implements IFigure{
	
	String name;
	private int positionX;
	private int positionY;

	public Circle(){}
	
	
	public String getName() {
		return this.name;		
	}

	public void setName(String name) {
		this.name = name;		
	}

	public void getPosition() {
		System.out.println("Circle X " + this.positionX);
		System.out.println("Circle Y " + this.positionY);		
	}

	public void move(int x, int y) {
		this.positionX = x;
		this.positionY = y;		
	}

	public IFigure clone() {
		IFigure figure = new Circle();
		figure.setName(this.name);
		figure.move(this.positionX, this.positionY);		
		return figure;
	}
	

}
