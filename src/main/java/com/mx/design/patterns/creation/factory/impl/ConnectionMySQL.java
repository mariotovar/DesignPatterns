package com.mx.design.patterns.creation.factory.impl;

import com.mx.design.patterns.creation.factory.IConnection;

public class ConnectionMySQL implements IConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	public void connect() {
		System.out.println("connecting MySQL");

	}

	public void disconnect() {
		System.out.println("disconnecting MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
