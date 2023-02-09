package insertingtotableusinguserinput;

import java.sql.*;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String un = "system";
	String pw = "system";
	Connection con  = null;
	PreparedStatement pstmt = null;
	//Step4: Creating incomplete query
	String query = "insert into car values(?,?)";
	try
	{
		//Step1 : Loading the Driver
		Class.forName(path);
		System.out.println("Driver is loaded successfully");
		//Step2 :Establishing the connection
		con = DriverManager.getConnection(url,un,pw);
		System.out.println("Connection is established successfully");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the brand name of car");
		String brand = scan.next();
		System.out.println("Enter the cost of car");
		int cost = scan.nextInt();
		//Step 3: Creating prepared statement
		pstmt = con.prepareStatement(query);
		pstmt.setString(1,brand);
		pstmt.setInt(2, cost);
		//Step 5:Executing the query
		pstmt.executeUpdate();
		System.out.println("Query has been executed");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
