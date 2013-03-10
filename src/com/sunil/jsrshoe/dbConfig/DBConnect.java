package com.sunil.jsrshoe.dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static Connection con;
	private static String driver = "com.mysql.jdbc.Driver";
	
	public static Connection getDbConnection() throws ClassNotFoundException, SQLException{
		Class.forName(driver);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/remotetiger","root","");
		if(con!=null)
			System.out.println("Connected!!!");
		return con;
	}
}
