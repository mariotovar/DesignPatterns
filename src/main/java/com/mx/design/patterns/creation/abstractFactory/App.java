package com.mx.design.patterns.creation.abstractFactory;

public class App {

    public static void main(String[] args) {
    	App.makeSofa(new ModernFurnitureFactory());
    	App.makeChair(new ModernFurnitureFactory());
    	App.makeSofa(new VictorianFurnitureFactory());
    	App.makeChair(new VictorianFurnitureFactory());    	
    }
    
    public static void makeSofa(FurnitureFactory furnitureFactory) {
        ISofa sofa = furnitureFactory.createSofa();
        sofa.hasLegs();
        sofa.sitOn();
        System.out.println("----------------------------------------------");
    }

    public static void makeChair(FurnitureFactory furnitureFactory) {
        IChair chair = furnitureFactory.createChair();
        chair.hasLegs();
        chair.sitOn();
        System.out.println("----------------------------------------------");
    }    
    
}
