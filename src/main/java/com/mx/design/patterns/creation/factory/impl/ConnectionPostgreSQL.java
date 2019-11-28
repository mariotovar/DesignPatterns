package com.mx.design.patterns.creation.factory.impl;

import com.mx.design.patterns.creation.factory.IConnection;

public class ConnectionPostgreSQL implements IConnection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	public void connect() {
		System.out.println("connecting PostgreSQL");

	}

	public void disconnect() {
		System.out.println("disconnecting PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}
	
}
