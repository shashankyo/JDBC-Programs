package com.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleApp {
	public static void createTable() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass ="system";
		String sql = "create table trainers(id int, name varchar2(20))";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Connected to Oracle DBMS: "+con);
	}
	
	
	public static void inserIntoTable() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass ="system";
		String sql = "insert into trainers(id , name) values (1, 'shashank')";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Connected to Oracle DBMS: "+con);
	}
	
}
