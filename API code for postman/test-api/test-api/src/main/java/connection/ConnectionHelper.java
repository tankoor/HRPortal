package main.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	
	private static String url;
	private static ConnectionHelper helper;
		
	private ConnectionHelper()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
				// TODO: handle exception
		}
	}
		
	public static Connection getConnection() throws SQLException
	{
		if (helper == null)
		{
			helper = new ConnectionHelper();
		}
			
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hrconsultancy","root","root");
	}
	
	public static void close(Connection con) throws SQLException {
		con.close();
	}
	
}