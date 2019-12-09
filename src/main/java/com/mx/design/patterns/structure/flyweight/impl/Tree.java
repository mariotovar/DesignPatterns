package com.mx.design.patterns.structure.flyweight.impl;

import com.mx.design.patterns.structure.flyweight.ILigthTree;

public class Tree implements ILigthTree {

	private String type;

	public Tree(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void draw(long x, long y, long z){
		System.out.println(
				"Tree [" + this.getType() + "] coordenates (" + x + ", " + y + ", " + z + ")");
	}

}
