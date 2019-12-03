package com.mx.design.patterns.creation.prototype;

import com.mx.design.patterns.creation.prototype.impl.Circle;

public class App {
	

	public static void main(String[] args) {

		Circle originCircle = new Circle();
		originCircle.setName("Circle");
		originCircle.move(10, 10);
		
		System.out.println(originCircle);
		System.out.println("name: " + originCircle.getName());
		System.out.println("position: ");
		originCircle.getPosition();
		System.out.println("--------------------------");
		
		Circle cloneCircle = (Circle) originCircle.clone();
		cloneCircle.move(100, 200);
		System.out.println(cloneCircle);
		System.out.println("name: " + cloneCircle.getName());
		System.out.println("position: ");
		cloneCircle.getPosition();		
		
	}
	

}
