package com.mx.design.patterns.creation.factory.impl;

import com.mx.design.patterns.creation.factory.IConnection;

public class ConnectionOracle implements IConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	public void connect() {
		System.out.println("connecting Oracle");

	}

	public void disconnect() {
		System.out.println("disconnecting Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
