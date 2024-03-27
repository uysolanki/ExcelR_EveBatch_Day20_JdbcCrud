package day20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnect {
		
		private static Connection con;
		private static String url="jdbc:mysql://localhost:3306/execommdb";
		private static String username="root";
		private static String password="";
		
		public static Connection getConnection() throws Exception
		{
			con=DriverManager.getConnection(url,username,password);
			return con;	
		}
		
		public static void closeConnection() throws Exception
		{
			con.close();
		}
		
}
