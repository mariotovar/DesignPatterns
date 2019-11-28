package com.mx.design.patterns.creation.factory;

import com.mx.design.patterns.creation.factory.impl.ConnectionMySQL;
import com.mx.design.patterns.creation.factory.impl.ConnectionOracle;
import com.mx.design.patterns.creation.factory.impl.ConnectionPostgreSQL;
import com.mx.design.patterns.creation.factory.impl.ConnectionSQLServer;

public class ConnectionFactory {
	
	public IConnection getConnection(ConnectionType motor) {			
		if (motor.equals(ConnectionType.MYSQL)) {
			return new ConnectionMySQL();
		} else if (motor.equals(ConnectionType.ORACLE)) {
			return new ConnectionOracle();
		} else if (motor.equals(ConnectionType.POSTGRESQL)) {
			return new ConnectionPostgreSQL();
		} else if (motor.equals(ConnectionType.SQLSERVER)) {
			return new ConnectionSQLServer();
		}
		return null;
	}

}
