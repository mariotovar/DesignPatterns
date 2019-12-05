package com.mx.design.patterns.structure.composite;

public class App {
	
	public static void main(String[] args) {
        
		SimpleProduct ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");
	    SimpleProduct ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000, "KingStone");
	
	    SimpleProduct disk500gb = new SimpleProduct("Disco Duro 500GB", 1500, "ACME");
	    SimpleProduct disk1tb = new SimpleProduct("Disco Duro 1TB", 2000, "ACME");
	
	    SimpleProduct cpuAMD = new SimpleProduct("AMD phenon", 4000, "AMD");
	    SimpleProduct cpuIntel = new SimpleProduct("Intel i7", 4500, "Intel");
	
	    SimpleProduct smallCabinete = new SimpleProduct("Gabinete Pequeño", 2000, "ExCom");
	    SimpleProduct bigCabinete = new SimpleProduct("Gabinete Grande", 2200, "ExCom");
	
	    SimpleProduct monitor20inch = new SimpleProduct("Monitor 20'", 1500, "HP");
	    SimpleProduct monitor30inch = new SimpleProduct("Monitor 30'", 2000, "HP");
	
	    SimpleProduct simpleMouse = new SimpleProduct("Raton Simple", 150, "Genius");
	    SimpleProduct gammerMouse = new SimpleProduct("Raton Gammer", 750, "Alien");
	
	    CompositeProduct gammerPC = new CompositeProduct("Gammer PC");
	    gammerPC.addProduct(ram8gb);
	    gammerPC.addProduct(disk1tb);
	    gammerPC.addProduct(cpuIntel);
	    gammerPC.addProduct(bigCabinete);
	    gammerPC.addProduct(monitor30inch);
	    gammerPC.addProduct(gammerMouse);
	
	    CompositeProduct homePC = new CompositeProduct("Casa PC");
	    homePC.addProduct(ram4gb);
	    homePC.addProduct(disk500gb);
	    homePC.addProduct(cpuAMD);
	    homePC.addProduct(smallCabinete);
	    homePC.addProduct(monitor20inch);
	    homePC.addProduct(simpleMouse);
	
	    CompositeProduct pc2x1 = new CompositeProduct("Paquete PC Gammer + Casa");
	    pc2x1.addProduct(gammerPC);
	    pc2x1.addProduct(homePC);
	
	    SaleOrder gammerOrder = new SaleOrder(1, "User Gammer");
	    gammerOrder.addProduct(gammerPC);
	    gammerOrder.printOrder();
	
	    SaleOrder homeOrder = new SaleOrder(2, "User Home");
	    homeOrder.addProduct(homePC);
	    homeOrder.printOrder();
	
	    SaleOrder comboOrder = new SaleOrder(3, "User Paquete 2x1 en PC");
	    comboOrder.addProduct(pc2x1);
	    comboOrder.printOrder();
	
	    SaleOrder customOrder = new SaleOrder(4, "User Multiple");
	    customOrder.addProduct(homePC);
	    customOrder.addProduct(ram8gb);
	    customOrder.addProduct(ram4gb);
	    customOrder.addProduct(monitor30inch);
	    customOrder.addProduct(gammerMouse);
	    customOrder.printOrder();

	}	

}
