package com.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlApp {
 
		
		public static void createTable() throws Exception{
			String url = "jdbc:mysql://localhost/test";
			String user="root";
			String pass ="root";
			String sql = "CREATE TABLE trainers(id INT, name VARCHAR(10))";

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Connected to MySql DBMS: "+con);
			System.out.println("Table created");
		}
			
			public static void insertTable() throws Exception{
				String url = "jdbc:mysql://localhost/test";
				String user="root";
				String pass ="root";
				String sql = "INSERT INTO trainers VALUES(2, 'SHIVA')";

				Connection con = DriverManager.getConnection(url, user, pass);
				Statement st = con.createStatement();
				st.executeUpdate(sql);
				System.out.println("Connected to MySql DBMS: "+con);
				System.out.println("Table created");

		
	
	}
}
