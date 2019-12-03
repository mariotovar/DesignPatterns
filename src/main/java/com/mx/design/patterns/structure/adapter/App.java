package com.mx.design.patterns.structure.adapter;

import com.mx.design.patterns.structure.adapter.impl.HDMItoRCAAdapter;

public class App {

	public static void main(String args[]){
	
		IRCA connector;
		
		connector = new HDMItoRCAAdapter();
		connector.getVideoAnalogic();
		connector.getAudioAnalogic();
	    		
	}
	    	
}
