package com.mx.design.patterns.creation.factory;

public class App {

	public static void main(String[] args) {
		
		ConnectionFactory factory = new ConnectionFactory();

		IConnection cx1 = factory.getConnection(ConnectionType.ORACLE);
		cx1.connect();
		cx1.disconnect();
		System.out.println("----------------------------------");
		IConnection cx2 = factory.getConnection(ConnectionType.MYSQL);
		cx2.connect();
		cx2.disconnect();
		System.out.println("----------------------------------");
		IConnection cx3 = factory.getConnection(ConnectionType.POSTGRESQL);
		cx3.connect();
		cx3.disconnect();
		System.out.println("----------------------------------");
		IConnection cx4 = factory.getConnection(ConnectionType.SQLSERVER);
		cx4.connect();
		cx4.disconnect();		
		System.out.println("----------------------------------");
		
	}

}