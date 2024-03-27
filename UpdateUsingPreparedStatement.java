package day20.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UpdateUsingPreparedStatement {
	public static void main(String[] args) throws Exception
	{
		Connection con=MySqlConnect.getConnection();
		//accept the jno, mp & rs and update  for that player
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		int jno=sc.nextInt();
		System.out.println("Enter New Matches Played");
		int mp=sc.nextInt();
		System.out.println("Enter New Runs Scored");
		int rs=sc.nextInt();
		String query="update player set matchesplayed=?, runscored=? where jerseyno=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, mp);
		ps.setInt(2, rs);
		ps.setInt(3, jno);
		int n=ps.executeUpdate();
		System.out.println(n+ "records updated");
		
		ps.close();
		con.close();
		
	}
}
