package updatecostofCar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String un = "system";
	String pw = "system";
	Connection con = null;
	PreparedStatement pstmt = null;
	
	//step:4 Creating incomplete Query
	String query = "update car set cost = ? where brand = ?";
	try
	{
		//step 1 : Loading the Driver
		Class.forName(path);
		System.out.println("Driver is loaded successfully");
		// step 2: Establishing the connection
		con = DriverManager.getConnection(url,un,pw);
		System.out.println("Connection established successfully");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the brand");
		String brand = scan.next();
		System.out.println("Enter the cost");
		int cost = scan.nextInt();
		//step3 : Creating the prepared statement
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1, cost);
		pstmt.setString(2, brand);
		//step5 : Executing the Query
		pstmt.executeUpdate();
		System.out.println("Query has been executed");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
