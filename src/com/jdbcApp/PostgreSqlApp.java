package com.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSqlApp {
	public static void createTable() throws Exception{
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user="postgres";
		String pass ="postgresql";
		String sql = "create table trainers(id int, name varchar(20))";

		Class.forName("org.postgresql.Driver");

		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Connected to Postgres DBMS: "+con);
	}
	
public static void insertTable() throws Exception{
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user="postgres";
		String pass ="postgresql";
		String sql = "insert into trainers values(4, 'sujay')";

		Class.forName("org.postgresql.Driver");

		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Connected to Postgres DBMS: "+con);
		System.out.println("Inserted into table");
	}
}
