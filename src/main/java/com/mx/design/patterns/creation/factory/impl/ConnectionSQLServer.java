package com.mx.design.patterns.creation.factory.impl;

import com.mx.design.patterns.creation.factory.IConnection;

public class ConnectionSQLServer implements IConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	public void connect() {
		System.out.println("connecting SQLServer");
	}

	public void disconnect() {
		System.out.println("disconnecting SQLServer");
	}

	@Override
	public String toString() {
		return "ConnectionSQLServer [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	
}
