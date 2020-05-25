package com.salesandstock.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.salesandstock.interfaces.CoreInterfaces;

public class ObjectHepler extends CoreFields implements CoreInterfaces {
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(getUrl(),getUsername(),getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
