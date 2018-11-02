package com.agile.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {

	public static Connection con=null;
	public static Connection getConnection()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root123");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return con;
	}
}
