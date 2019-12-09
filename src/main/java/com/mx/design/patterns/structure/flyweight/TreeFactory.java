package com.mx.design.patterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.mx.design.patterns.structure.flyweight.impl.Tree;

public class TreeFactory{

    private Map<String, Tree> trees;

    public TreeFactory(){
    	this.trees = new HashMap<String, Tree>();
    }

    public ILigthTree getTree(String type){
    	if(!trees.containsKey(type)){
    		trees.put(type, new Tree(type));
        }
        return trees.get(type);
    }

}