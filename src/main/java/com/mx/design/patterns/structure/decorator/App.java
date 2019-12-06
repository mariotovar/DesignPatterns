package com.mx.design.patterns.structure.decorator;

import com.mx.design.patterns.structure.decorator.imp.BasicWatch;
import com.mx.design.patterns.structure.decorator.imp.LuxuryWatchDecorator;
import com.mx.design.patterns.structure.decorator.imp.SportWatchDecorator;

public class App {
	
	public static void main(String... args) {

        Watch basicWatch = new BasicWatch();
        basicWatch.createFunctionality();
        System.out.println("\n---------");

        Watch sportsWatch = new SportWatchDecorator(new BasicWatch());
        sportsWatch.createFunctionality();
        System.out.println("\n---------");

        Watch sportsLuxuryWatch = new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportsLuxuryWatch.createFunctionality();
    }	

}
