package day20.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws Exception{
		
		Connection con=MySqlConnect.getConnection();
		
		String query;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Jersey Number");
		int a=sc.nextInt();
		System.out.println("Enter Player Name");
		String b=sc.next();
		System.out.println("Enter Player Matches Played");
		int c=sc.nextInt();
		System.out.println("Enter Player Runs Scored");
		int d=sc.nextInt();
		System.out.println("Enter Player Not Out");
		int e=sc.nextInt();
		
		query="insert into player values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setInt(3, c);
		ps.setInt(4, d);
		ps.setInt(5, e);
		
		int n=ps.executeUpdate();
		System.out.println(n+ "Rows Inserted");
		
		ps.close();
		con.close();

	}

}
