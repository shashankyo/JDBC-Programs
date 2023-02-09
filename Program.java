package insertingintotable;

import java.sql.*;

public class Program {
public static void main(String[] args) {
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String un = "system";
	String pw = "system";
	Connection con = null;
	Statement stmt = null;
	// Step 4: creating a query
	String query = "insert into car values('Audi',2000000)";
	try
	{
		//Step1: Loading the Driver
		Class.forName(path);
		System.out.println("Driver is loaded successfully");
		//Step2: Establishing the connection
		con = DriverManager.getConnection(url,un,pw);
		System.out.println("Connection is established successfully");
		//Step3 : Creating  statement
		stmt = con.createStatement();
		//Step5 : Executing the Query
		stmt.executeUpdate(query);
		System.out.println("Query has been executed");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
