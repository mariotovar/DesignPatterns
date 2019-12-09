package com.mx.design.patterns.structure.flyweight;

import java.util.Random;

public class App {
	
	public static void main(String[] args){
		
		int numberOfTree = 10;
		String[] types = {"Pine","Willow","Fir"};
		TreeFactory factory = new TreeFactory();

		Random random = new Random();
		Random coordenate = new Random();	
		
		for(int i=0; i<numberOfTree; i++){
			int x = random.nextInt(3);
			System.out.print(factory.getTree(types[x]));
			factory.getTree(types[x]).draw(coordenate.nextLong(), coordenate.nextLong(), coordenate.nextLong());
	    }

	}
	
}
