package com.domex.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClientDao {
	
	private static Connection connection;
	public static Connection getDBconection() {
		if(connection == null) {
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Order_Management_System","root","");
			
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}
